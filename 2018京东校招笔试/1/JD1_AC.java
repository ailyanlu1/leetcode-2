package jd_test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//AC
public class JD1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        String s = Integer.toString(x);
        String []ss = s.split("");
        Arrays.sort(ss, Comparator.reverseOrder());
        StringBuffer sb = new StringBuffer();
        for (String s1 : ss) {
            sb.append(s1);
        }
        int out = Integer.parseInt(sb.toString());
        System.out.println(out);
    }
}
