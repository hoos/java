import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String []strings = new String[N];
        for (int i = 0; i < N; i++) {
            strings[i] = sc.next();
        }
        int Q = sc.nextInt();
        sc.nextLine();
        String []queries = new String[Q];
        for (int j = 0; j < Q; j++) {
            queries[j] = sc.next();
        }
        sc.close();
        //System.out.println("N=" + N + " " + "Q=" + Q);
        //System.out.println("Strings=" + Arrays.toString(strings));
        //System.out.println("Queries=" + Arrays.toString(queries));
        int [][]results = new int[Q][1];
        int count = 0;
        //results[0][0] = 1;
        for (int k = 0; k < N; k++) {
            for (int l = 0; l < Q; l++) {
                //System.out.println("Query=" + queries[l]);
                Pattern pattern = Pattern.compile("\\b" + queries[l] + "\\b");
                //System.out.println("Pattern=" + strings[k]);
                Matcher matcher = pattern.matcher(strings[k]);
                while (matcher.find()) {
                    count++;
                    results[l][0] = count;
                }
            }
         }
         for (int m = 0; m < Q; m++) { 
             System.out.println(results[m][0]);
         }
    }
}
