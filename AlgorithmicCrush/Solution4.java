import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution4 {

    public static void main(String[] args) {
	    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        long startTime = System.currentTimeMillis();
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int []list = new int[N];
	    int M = sc.nextInt();
	    //System.out.println("N=" + N + " M=" + M); 
        long endTime = System.currentTimeMillis();
        //System.out.println("Array creation: " + (endTime - startTime));
	    int maxValue = 0;
	    sc.nextLine();
        //startTime = System.currentTimeMillis();
        int []a = new int[M];
        int []b = new int[M];
        int []k = new int[M];
	    for (int i = 0; i < M; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            k[i] = sc.nextInt();
            //System.out.println("a=" + a + " b=" + b + " k=" + k);
            //System.out.print("M" + i + "\r");
            /*for (int j = a; j < b; j++) {
                //System.out.print("j" + j + "\r");
                list[j] = list[j] + k;
            }*/
	    }
	    for (int i = 0; i < M; i++) {
            for (int j = a[i]; j < b[i]; j++) {
                list[j] = list[j] + k[i];
            }
	    }
	    for (int j = 0; j < list.length; j++) {
            if(maxValue < list[j]) {
                maxValue = list[j];
            }
        }

	    System.out.println("Max Value=" + maxValue);
        //endTime = System.currentTimeMillis();
        //System.out.println("Max Value Fetch: " + (endTime - startTime));
    }
}
