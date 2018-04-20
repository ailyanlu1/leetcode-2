import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++){
            int n = in.nextInt();
            int len = 0;
            int count = 1;
            int level = 9;
            while(n>0){
                if(n>=level){
                    len+=level*count;
                    n-=level;
                }else{
                    len+=n*count;
                    n=0;
                }
                count++;
                level*=10;
            }
            //9 90 900 9000

            System.out.println(len);
        }
    }
}
