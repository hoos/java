import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int getCount(String regEx, int length) {
        int count = 0;
        return count;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        int []results = new int[testCases]; 
        for(int i = 0; i < testCases; i++){
            String regEx = in.next();
            int length = in.nextInt();
            results[i] = getCount(regEx, length);
        }
        System.out.println(Arrays.toString(results));
    }
}
