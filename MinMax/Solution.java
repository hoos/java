import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Prlong output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int N[] = new int[5];
        for (int i = 0; i < N.length; i++) {
            N[i] = in.nextInt();
        } 
        in.close();
        Arrays.sort(N);
        int sumMin[] = Arrays.copyOfRange(N, 0, N.length-1);
        int sumMax[] = Arrays.copyOfRange(N, 1, N.length);
        System.out.println(sum(sumMin) + " " + sum(sumMax));
    }

    public static long sum(int[] seq) {
        long sum = 0;
        for (int i = 0; i < seq.length; i++) {
            sum += seq[i];
        }
        return sum;
    }
}
