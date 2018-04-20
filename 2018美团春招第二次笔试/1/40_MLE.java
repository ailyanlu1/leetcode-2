import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++){
            int n = in.nextInt();
            StringBuilder sb = new StringBuilder();
            for(int j=1;j<=n;j++){
                sb.append(j);
            }
            String start = sb.toString();
            System.out.println(start.length());
        }
    }
}
