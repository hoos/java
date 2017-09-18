import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution2 {

    public static void main(String[] args) {
        try {
	    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	    Scanner in = new Scanner(new File("input06.txt"));

	    // Create a list, seqList, of N empty sequences, where each sequence is indexed from 0
	    // to N -1. The elements within each of the  sequences also use 0-indexing.
	    int N = in.nextInt();
	    int Q = in.nextInt(); // Number of Queries

            //List []seqList = new List[99999];
	    List<List<Integer>> seqList = new ArrayList<List<Integer>>();
	    for (int i = 0; i < N; i++) {
		seqList.add(new ArrayList<Integer>());
	    }

	    // Create an integer, lastAnswer, and initialize it to 0
	    int lastAnswer = 0;
	    int x = 0;
	    int y = 0;
	    int seqIndex = 0;

	    for (int i = 0; i < Q; i++) {
		int queryType = in.nextInt();
		x = in.nextInt();
		y = in.nextInt();
		seqIndex = seqIndex = (x^lastAnswer)%N;
		switch (queryType) {
		    case 1:    
			   List<Integer> seqElement = seqList.get(seqIndex);
			   seqElement.add(Integer.valueOf(y));
			   break;
		    case 2:
			   int element = y%(seqList.get(seqIndex).size());
			   lastAnswer = seqList.get(seqIndex).get(element);
			   System.out.println(lastAnswer);
			   break;
		}
	    }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
