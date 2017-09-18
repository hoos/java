import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int grade = in.nextInt();
            if (grade < 38) {
                System.out.println(grade);
            } else {
                int fiveMultiple = (int) Math.ceil((double) grade/5) * 5;
                int diff = fiveMultiple - grade;
                if(diff < 3) {
                    System.out.println(fiveMultiple);                
                } else {
                    System.out.println(grade);                
                }
                
            }
        } 
    }
}
