import java.util.*;

public class Main {

    static int gcd(int i, int j) {
        int k;
        while ((k=i%j) != 0) {
            i = j;
            j = k;
        }
        return j;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int p = in.nextInt();
        int sum=0;

        int[] A = new int[N+1];
        A[1] = p;
        for(int i=2;i<=N;i++){
            A[i] = (A[i-1]+153)%p;
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                sum+=A[gcd(i,j)];
            }
        }

        System.out.println(sum);

    }
}
