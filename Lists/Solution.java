import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);

        // Create a list, seqList, of N empty sequences, where each sequence is indexed from 0
        // to N -1. The elements within each of the  sequences also use 0-indexing.
        int N = in.nextInt();
        int Q = in.nextInt(); // Number of Queries
        System.out.println("N=" + N + " Q=" + Q);
        List<List<Integer>> seqList = new ArrayList<List<Integer>>(N);
        for (int i = 0; i < N; i++) {
            seqList.add(i, new ArrayList<Integer>(N));
        }

        System.out.println("Size of seqList=" + seqList.size());

        for (int j = 0; j < 3; j++) {
            List<Integer> seqElement = seqList.get(j);
            seqElement.add(new Integer(j));
            seqList.add(j, seqElement);
            printElement(j, seqList.get(j));
        }
  
    }

    public static void printElement(int index, List<Integer> list) {
        System.out.println("Index = " + index  + " " + Arrays.toString(list.toArray()));
    }
}
