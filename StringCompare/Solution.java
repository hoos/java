import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "y";//initialized to largest value
        String largest = "";//empty strings are the smallest
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for (int i=0; i<s.length()-(k-1); i++) {
            String sub = s.substring(i, i+k);
            //System.out.println(sub);
            //Negative number indicates smallessub is smaller than sub1
            if(sub.compareTo(smallest) < 0) {
                //sub is smaller than sub
                //System.out.println("sub=" + sub + " is smaller than Smallest=" + smallest);
                smallest = sub;
            } 
            if(sub.compareTo(largest) > 0) {
                //System.out.println("Largest=" + sub);
                largest = sub;
            }
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println("\n" + getSmallestAndLargest(s, k));
    }
}
