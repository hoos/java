import java.io.*;
import java.math.*;
import java.util.*;

public class Solution3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] sorted = new String[n];
        for(int sorted_i=0; sorted_i < n; sorted_i++){
            sorted[sorted_i] = in.next();
        }

        BigInteger[] unsorted = new BigInteger[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = new BigInteger(sorted[unsorted_i]);
        }
        quickSort(0, unsorted.length -1, unsorted);
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out),32768);
        try {
            for (int i = 0; i < unsorted.length; i++) {
                //System.out.println(unsorted[i]);
                out.write(unsorted[i] + "\n");
            }
            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void quickSort(int lowerIndex, int higherIndex, BigInteger[] array) {
		int i = lowerIndex;
		int j = higherIndex;
		BigInteger pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
		while (i <= j) {
			while (array[i].compareTo(pivot) == -1) {
				i++;
			}
			while (array[j].compareTo(pivot) == 1) {
				j--;
			}
			if (i <= j) {
				exchangeNumbers(i, j, array);
				i++;
				j--;
			}
		}
		if (lowerIndex < j)
			quickSort(lowerIndex, j, array);
		if (i < higherIndex)
			quickSort(i, higherIndex, array);
    }

	private static void exchangeNumbers(int i, int j, BigInteger[] array) {
		BigInteger temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
