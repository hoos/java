import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int []list = new int[N];
        int M = sc.nextInt();
        //System.out.println("list length=" + list.length + " queries=" + M);
        int maxValue = 0;
        //sc.nextLine();
        for (int i = 0; i < M; i++) {
            for (int j = sc.nextInt(); j < sc.nextInt(); j++) {
                //System.out.println("i=" + i + " j=" + j);
                list[j-1] = list[j-1] + sc.nextInt();
                if(maxValue < list[j-1]) {
                maxValue = list[j-1];
                }
            }
        }
        System.out.println(maxValue);
    }
}
