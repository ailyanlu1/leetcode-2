import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++){
            int n = in.nextInt();
            int len = 0;
            for(int j=1;j<=n;j++){
                int count = 0;
                int z = j;
                while(z!=0){
                    count++;
                    z/=10;
                }
                len += count;
            }
            System.out.println(len);
        }
    }
}
