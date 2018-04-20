import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        for(long i=0;i<t;i++){
            long n = in.nextLong();
            long len = 0;
            long count = 1;
            long level = 9;
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
