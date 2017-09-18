import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int[][] hourglass = new int[][] {{1, 1, 1}, {0, 1, 0}, {1, 1, 1}};

    public static int getHourglassSum(int arr[][], int rowoffset, int coloffset) {
        int sum = 0;
        //loop through the hourglass and where the value is one,
        //add the value from A to sum, starting at the offset
        for(int hour_i=0; hour_i < 3; hour_i++) {
            for(int hour_j=0; hour_j < 3; hour_j++) {
                //stem.out.println(hourglass[hour_i][hour_j]);
                if (hourglass[hour_i][hour_j] == 1) {  
                    sum = sum + arr[hour_i + rowoffset][hour_j + coloffset];
                }
            }
        }
        return sum;   
    }
   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        
        int largestSum = -64;
        for(int arr_i=0; arr_i < arr[0].length -2; arr_i++){
            for(int arr_j=0; arr_j < arr[0].length -2; arr_j++){
                int sum = getHourglassSum(arr, arr_j, arr_i);  
                //System.out.println(arr_i + " " + arr_j + " " + sum);
                if (largestSum < sum) {
                    largestSum = sum;
                }
            }
        }
        System.out.println(largestSum);
    }
}
