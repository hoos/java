import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try {
	    Scanner in = new Scanner(new File("input06.txt"));

	    // Create a list, seqList, of N empty sequences, where each sequence is indexed from 0
	    // to N -1. The elements within each of the  sequences also use 0-indexing.
	    int N = in.nextInt();
	    int Q = in.nextInt(); // Number of Queries
	    System.out.println("N=" + N + " Q=" + Q);
	    List<List<Integer>> seqList = new ArrayList<List<Integer>>(N);
	    for (int i = 0; i < N; i++) {
		seqList.add(new ArrayList<Integer>(N));
	    }

	    System.out.println("Size of seqList=" + seqList.size());

	    // Create an integer, lastAnswer, and initialize it to 0
	    int lastAnswer = 0;

	    for (int i = 0; i < Q; i++) {
		int queryType = in.nextInt();
		int x = in.nextInt();
		int y = in.nextInt();
		if(queryType == 1) {
		    int seqIndex = (x^lastAnswer)%N;
		    System.out.println("QueryOne x=" + x + " y=" + y + " seq=" + seqIndex);
		    List<Integer> seqElement = seqList.get(seqIndex);
		    seqElement.add(new Integer(y));
		    //seqList.add(seqIndex, seqElement);

		    List<Integer> s0 = seqList.get(seqIndex);
		    System.out.println("s0 = " + Arrays.toString(s0.toArray()));

		    List<Integer> s1 = seqList.get(1);
		    System.out.println("s1 = " + Arrays.toString(s1.toArray()));

		    /*List<Integer> s2 = seqList.get(2);
		    System.out.println("s2 = " + Arrays.toString(s2.toArray()));*/
		    
		} else if(queryType == 2) {
		    int seq = (x^lastAnswer)%N;
		    int element = y%(seqList.get(seq).size());
		    lastAnswer = seqList.get(seq).get(element);
		    System.out.println("QueryTwo x=" + x + " y=" + y + " seq=" + seq + " lastAnswer=" + lastAnswer);
		}
	    }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
