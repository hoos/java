import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }
        quickSort(0, unsorted.length -1, unsorted);
        for (int i = 0; i < unsorted.length; i++) {
            System.out.println(unsorted[i]);
        }
    }

    public static void quickSort(int lowerIndex, int higherIndex, String[] array) {
		int i = lowerIndex;
		int j = higherIndex;
		BigInteger pivot = new BigInteger(array[lowerIndex+(higherIndex-lowerIndex)/2]);
		while (i <= j) {
			while (new BigInteger(array[i]).compareTo(pivot) == -1) {
				i++;
			}
			while (new BigInteger(array[j]).compareTo(pivot) == 1) {
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

	private static void exchangeNumbers(int i, int j, String[] array) {
		String temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
