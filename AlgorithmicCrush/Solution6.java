import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        long startTime = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int []list = new int[N];
        int M = sc.nextInt();
        long endTime = System.currentTimeMillis();
        int maxValue = 0;
        sc.nextLine();
        int a;
        int b;
        int k;
        int querySize;
        for (int i = 0; i < M; i++) {
            //System.out.println("M" + i + "\r");
            a = sc.nextInt();
            b = sc.nextInt();
            k = sc.nextInt();
            querySize = b - a;
            int []sumArray = new int[querySize];
            System.arraycopy(list, a, sumArray, 0, querySize); 
            for (int j = 0; j < querySize; j++) {
                sumArray[j] = sumArray[j] + k;
            }
            System.arraycopy(sumArray, 0, list, a, querySize);
        }
        for (int j = 0; j < list.length; j++) {
            if(maxValue < list[j]) {
                maxValue = list[j];
            }
        }
        System.out.println(maxValue);
    }
}
