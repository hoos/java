import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        try {
	    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        long startTime = System.currentTimeMillis();
	    Scanner sc = new Scanner(new File("inputExample.txt"));
	    int N = sc.nextInt();
	    int []list = new int[N];
	    int M = sc.nextInt();
	    System.out.println("N=" + N + " M=" + M); 
        long endTime = System.currentTimeMillis();
        System.out.println("Array creation: " + (endTime - startTime));
	    int[] ops = new int[3];
	    int maxValue = 0;
        
	    sc.nextLine();
        startTime = System.currentTimeMillis();
	    for (int i = 0; i < M; i++) {
		//ops[0] = sc.nextInt();
		//ops[1] = sc.nextInt();
		//ops[2] = sc.nextInt();
		//System.out.println("ops=" + Arrays.toString(ops)); 
            for (int j = sc.nextInt(); j < sc.nextInt(); j++) {
                list[j] = list[j] + sc.nextInt();
                if(maxValue < list[j]) {
                maxValue = list[j];
                }
            }
	    }
	    System.out.println(maxValue);
        endTime = System.currentTimeMillis();
        System.out.println("Max Value Time: " + (endTime - startTime));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
