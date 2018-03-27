import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int count = 0;

        Queue<OP> q = new LinkedList<>();

        q.offer(new OP(1,1, 1, 1));
        q.offer(new OP(2,1, 1, 1));
        while(!q.isEmpty()){
            int m = -99, s = -99;
            OP op = q.poll();
            if(op.op==1){
                m = op.s;
                s = op.s + op.s;
            }else if(op.op==2){
                m = op.m;
                s = op.s + op.m;
            }
//            System.out.println(String.format("%s %s %s",op.op, op.lv, s));
            if(s == n){
                count = op.lv;
                break;
            }

//            important!重要且巧妙的剪枝操作, 直接扭转333和332等结果为20以上的TLE的局面
            if (s < 10000) {
                q.offer(new OP(1,op.lv+1, s, m));
                q.offer(new OP(2,op.lv+1, s, m));
            }
        }

        System.out.println(count);

    }

    static class OP{
        OP(int op, int lv, int s, int m) {
            this.op = op;
            this.lv = lv;
            this.s = s;
            this.m = m;
        }

        int op;
        int lv;
        int s;
        int m;
    }
}
