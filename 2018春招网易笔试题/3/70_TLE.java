import java.util.*;
import java.util.stream.Collector;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<n;i++){
            sb.append(i);
        }
        String start = sb.toString();
        int sum = getSum(start);

        for(int i=n;i<=m;i++){
            String now = Integer.toString(i);
            sum += getSum(now);
            if(sum%3==0){
                count++;
            }
        }
        System.out.println(count);

    }

    private static int getSum(String now){
        int sum=0;
        for (String s :now.split("")) {
            sum+=Integer.parseInt(s);
        }
        return sum;
    }
}
