import java.util.*;

public class Main {
    private static int count=0;

    public static class MySet<E> extends HashSet<E>{
        int sum = 0;
        double avg = 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        MySet<Integer> a = new MySet<>();
        MySet<Integer> b = new MySet<>();

        for(int i = 0; i < n; i++){
            int input = in.nextInt();
            a.add(input);
            a.sum += input;

        }
        for(int i = 0; i < m; i++){
            int input = in.nextInt();
            b.add(input);
            b.sum += input;
        }
        a.avg = (double) a.sum / a.size();
        b.avg = (double) b.sum / b.size();


        Boolean flag = true;

        while (flag) {
            if (a.avg > b.avg) {
                flag = move(a, b);
            } else {
                flag = move(b, a);
            }
        }
        System.out.println(count);

    }


    private static Boolean move(MySet<Integer> s, MySet<Integer> d){
        Boolean flag = false;
        int remove = -1;
        for(Integer i:s){
            if(i<s.avg && i>d.avg){
                remove = i;
                count++;
                flag=true;
                break;
            }
        }
        if(flag){
            s.remove(remove);
            d.add(remove);
            s.sum-=remove;
            d.sum+=remove;
            s.avg = (double) s.sum / s.size();
            d.avg = (double) d.sum / d.size();
        }
        return flag;
    }


}
