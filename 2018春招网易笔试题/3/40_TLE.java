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
        //String start = sb.toString();
        for(int i=n;i<=m;i++){
            sb.append(i);
            String now = sb.toString();
            int sum=0;
            for (String s :now.split("")) {
                sum+=Integer.parseInt(s);
            }
            if(sum%3==0){
                count++;
            }
        }
        System.out.println(count);

    }

}
