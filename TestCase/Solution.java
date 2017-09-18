import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t = 5;
        System.out.println(t);
        ArrayList<Integer> N = new ArrayList<Integer>();
        for (int i = 0; i < t; i++) {
            int n = (getN(N) + 3);
            int k = getRandInt(1, n);
            System.out.println(n + " " + k);
            for (int j = 0; j < n - 3; j++) {
                System.out.print(getRandInt(-100, 1000) + " ");
            }
            System.out.print("-1 " + "0 " + "1\n");
        }
    }

    public static int getN(ArrayList<Integer> N) {
        int n = getRandInt(3, 197) + 3;
        while(N.contains(n)) {
            n = getRandInt(3, 197) + 3;
        }
        N.add(n);
        return n; 
    }
 
    public static int getRandInt(int min, int max) {
        return (int) (Math.random() * max + min);
    }

}
