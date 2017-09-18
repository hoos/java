import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long []list = new long[N];
        long M = sc.nextLong();
        long maxValue = 0l;
        sc.nextLine();
        int a = 0;
        int b = 0;
        int k = 0;
        while (sc.hasNextLine()) {
           // System.out.print("At M=" + i + "\r");
            a = sc.nextInt();
            //b = sc.nextInt();
            //k = sc.nextInt();
            //System.out.println("a=" + a + " b=" + b + " k=" + k);
            for (int j = a; j < sc.nextInt(); j++) {
                list[j] = list[j] + sc.nextInt();
                if(maxValue < list[j]) {
                    maxValue = list[j];
                }
                //System.out.println(maxValue);
            } 
                sc.nextLine();
         }
         System.out.println(maxValue);
    }
}
