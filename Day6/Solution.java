import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            String even = "";
            String odd = "";
            String test = new String(in.next());
            char[] c  = test.toCharArray();
            even = even + c[0];
            for (int j = 1; j < c.length; j++) {
                if (j%2==0) {
                    even = even + c[j];
                } else {
                    odd = odd + c[j];
                }
            }  
            System.out.print(even + " " + odd + "\n");
        }      
    }
}
