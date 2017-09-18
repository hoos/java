import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long []list = new long[N];
        long M = sc.nextLong();
        long maxValue = 0l;
        sc.nextLine();
        int a = 0;
        int b = 0;
        int k = 0;
        for (int i = 0; i < M; i++) {
            System.out.print("At M=" + i + "\r");
            a = sc.nextInt();
            b = sc.nextInt();
            k = sc.nextInt();
            for (int j = a; j < b; j++) {
                list[j-1] = list[j-1] + k;
                if(maxValue < list[j-1]) {
                    maxValue = list[j-1];
                }
            }
        }
        System.out.println(maxValue);
    }
}
