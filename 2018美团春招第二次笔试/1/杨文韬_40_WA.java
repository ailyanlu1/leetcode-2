import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt(), digit = 1, result = 0;
            while ((int) Math.pow(10, digit) < n) {
                result += ((int) Math.pow(10, digit) - (int) Math.pow(10, digit - 1)) * digit;
                digit++;
            }
            result += (1 + n - (int) Math.pow(10, digit - 1)) * digit;
            if (n == (int) Math.pow(10, digit)) result++;
            System.out.println(result);
        }
    }
}
