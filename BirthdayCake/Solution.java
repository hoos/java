import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Prlong output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int N[] = new int[in.nextInt()];
        for (int i = 0; i < N.length; i++) {
            N[i] = in.nextInt();
        } 
        in.close();
        Arrays.sort(N);
        long age = N[N.length -1];
        long tallCandles = 0;
        for (int i = N.length ; i > 0; i--) {
            if (N[i-1] == age) {
                tallCandles++;
            }
        }
        System.out.println(tallCandles);
    }
}
