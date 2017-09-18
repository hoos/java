import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            // your code goes here
            if (s.length() <= 1) {
                System.out.println("NO");
            } else if (!isSequential(s)) {
                System.out.println("NO"); 
            } else {
                System.out.println("YES");
            }
          
        }
    }

    public static boolean isSequential(String s) {
        boolean isSequence = true; 

        for(int i = 0; i < s.length() -1 ; i++) {
            if (Integer.parseInt(s.substring(i+1, i+2)) - Integer.parseInt(s.substring(i, i+1)) != 1) {
                isSequence = false;
                break;
            }
        }
        return isSequence;
    }

    public static boolean isSeqInc(String s) {
        boolean isSequence = true; 

        for(int i = 0; i < s.length() -1 ; i++) {
            int a = Integer.parseInt(s.substring(i+1, i+2));
            if (Integer.parseInt(s.substring(i+1, i+2)) - Integer.parseInt(s.substring(i, i+1)) != 1) {
                isSequence = false;
                break;
            }
        }
        return isSequence;
    }

}
