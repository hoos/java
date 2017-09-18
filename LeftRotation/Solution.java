import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int []a = new int[n];
        int []da = new int[d];
        int []sa = new int[n-d];
        System.out.println("n=" + n + " d=" + d);
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        } 
        //System.out.println(Arrays.toString(a));
        for (int j = 0; j < n; j++) {
            if (j < d) {
                da[j] = a[j];
                //System.out.println("da=" + Arrays.toString(da));
            } else if (j>=d) {
                sa[j-d] = a[j];
                //System.out.println("sa=" + Arrays.toString(sa));
            }
        }
        System.arraycopy(sa, 0, a, 0, sa.length);
        System.arraycopy(da, 0, a, sa.length, da.length);

        System.out.println(Arrays.toString(a));
    }
}
