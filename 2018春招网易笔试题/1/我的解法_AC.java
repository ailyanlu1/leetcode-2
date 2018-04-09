import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int d = 1;
        //1:N, 2:E, 3:S, 4:W
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'L'){
                d--;
            }else if(c == 'R'){
                d++;
            }
            if(d == 0){
                d = 4;
            }
            if(d == 5){
                d = 1;
            }
        }
        if(d == 1){
            System.out.println("N");
        }else if(d == 2){
            System.out.println("E");
        }else if(d == 3){
            System.out.println("S");
        }else if(d == 4){
            System.out.println("W");
        }

    }

}
