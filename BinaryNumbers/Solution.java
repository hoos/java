import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String binary = Integer.toBinaryString(n);
        int consecutive = 0;
        int current = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (Integer.parseInt(Character.toString(binary.charAt(i))) == 1) {
                current++;
                if (current > consecutive) {
                    consecutive = current;
                }
            } else {
                current = 0;
            }
        }
        System.out.println(consecutive);
    }
}
