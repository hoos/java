import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int powerSum(int x, int i, int n, int result, int sum) {

            System.out.println("Called with Result=" + result);
            if(((int) Math.pow(i,n) + sum) == x) {
                //System.out.println("Found condition i=" + i + " sum=" + sum  + " total=" + ((int) Math.pow(i,n) + sum));
                result++;
                System.out.println("Incrementing Result=" + result);
                return result;
            } else  if (((int) Math.pow(i,n) + result) > x) {
                return result;
            } else {
                sum += (int) Math.pow(i,n);
                //System.out.println("Summing remaining numbers i=" + i + " sum=" + sum); 
                for (int j=i-1; j>=1; j--) {
                    result = powerSum(x, j, n, result, sum);
                }
            }

        return result; 
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int n = in.nextInt();
        int result = 0;
        for (int i = x; i > 0; i--) {
            int pow = (int) Math.pow(i,n);
            System.out.println("i=" + i +" pow=" + (int) Math.pow(i,n));

            if((pow>x)) {
                //System.out.println("Exit x=" + x  + " i=" + i + " pow=" + pow + " Fuckoff");
            };

            result = powerSum(x, i,n,result,0);
        }
        System.out.println(result);
    }
}
