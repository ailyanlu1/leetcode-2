import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int []a = new int[n];
        int count = 0;
        Map<Integer, Boolean> map= new HashMap<>();
        for(int i = 0; i < n; i++){
            a[i] = in.nextInt();
            map.put(a[i], true);
        }
        for(int i = 0; i < n; i++){
            if(map.get(a[i] - k) != null){
                map.remove(a[i]);
                count++;
            }else if(map.get(a[i] + k) != null){
                map.remove(a[i]);
                count++;
            }
        }
        System.out.println(count);
    }
}
