import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        int max=x, mid=y ,min=z;
        int count = 0;

        while(max!=mid || mid!=min){
            if(x>y){
                if(y>z){
                    max = x;mid = y;min = z;
                }else{
                    max = x;mid = z;min = y;
                }
            }else{
                if(y<z){
                    max = z;mid = y;min = x;
                }else{
                    max = y;mid = z;min = x;
                }
            }

            if(max-min>=2){
                min+=2;
                count++;
            }else{
                min+=1;
                mid+=1;
                count++;
            }
            x=max;y=mid;z=min;

        }
        System.out.println(count);
    }
}
