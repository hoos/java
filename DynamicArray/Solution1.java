import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);

        // Create a list, seqList, of N empty sequences, where each sequence is indexed from 0
        // to N -1. The elements within each of the  sequences also use 0-indexing.
        int N = in.nextInt();
        N = (N > (10^5)) ? 10^5 - 1 : N;
        int Q = in.nextInt(); // Number of Queries
        Q = (Q > (10^5)) ? 10^5 - 1: Q;
        List<List<Integer>> seqList = new ArrayList<List<Integer>>(N);
        for (int i = 0; i < N; i++) {
            seqList.add(new ArrayList<Integer>(N));
        }

        // Create an integer, lastAnswer, and initialize it to 0
        int lastAnswer = 0;

        for (int i = 0; i < Q; i++) {
            int queryType = in.nextInt();
            int x = in.nextInt();
            x = (x > (10^9)) ? (10^9 -1) : x;
            int y = in.nextInt();
            y = (y > (10^9)) ? (10^9 -1) : y;
            if(queryType == 1) {
                int seqIndex = (x^lastAnswer)%N;
                List<Integer> seqElement = seqList.get(seqIndex);
                seqElement.add(new Integer(y));
            } else if(queryType == 2) {
                int seq = (x^lastAnswer)%N;
                int element = y%(seqList.get(seq).size());
                lastAnswer = seqList.get(seq).get(element);
                System.out.println(lastAnswer);
            }
        }
    }

}
