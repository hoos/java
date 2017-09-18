import java.io.*;
import java.util.*;

public class Solution1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<String> names = new ArrayList<String>();
        for (int i = 0; i < t; i++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int max = 0;
            int current = 0;
            for (int a = 1; a <= N; a++) {
                current = (a & a-1);
                if (current > max && current < K) {
                    max = current;
                }
            }
            System.out.println(max);
        }
    }
}
