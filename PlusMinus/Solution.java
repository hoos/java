import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int[] N = new int[(in.nextInt())];
        int sumPositive = 0;
        int sumNegative = 0;
        int sumZero = 0;
        for (int i = 0; i < N.length; i++) {
            N[i] = in.nextInt();
            if (N[i] > 0) {
                sumPositive ++;
            } else if(N[i] < 0) {
                sumNegative ++;
            } else {
                sumZero++;
            }
        }
        //System.out.println(Arrays.toString(N));
        //System.out.println(sumPositive);
        //System.out.println(N.length);
        System.out.printf("%.6f\n", (double) sumPositive/N.length);
        System.out.printf("%.6f\n", (double) sumNegative/N.length);
        System.out.printf("%.6f\n", (double) sumZero/N.length);
    }
}
