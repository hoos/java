import java.util.*;
import java.math.*;

public class Solution1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }

        for (int i = 0; i < unsorted.length; i++) {
            System.out.println(unsorted[i]);
        }
    }

    public boolean compare(String i, String j) {
        int n=i.length();
        int m=j.length();
        if(n==m)
            return (i<j);
        
        return n<m;  
    }
}
