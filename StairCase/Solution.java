import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.close();
        char[] chars = new char[N];
        Arrays.fill(chars,' ');
        for (int i = N; i > 0 ; i--) {
            chars[i-1] = '#';
            System.out.printf("%s\n", String.valueOf(chars));
        }
    }
}
