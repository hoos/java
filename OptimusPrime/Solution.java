import java.io.*;
import java.util.*;

public class Solution {

    static boolean isPrime(int n) {
        if(n < 2) return false;
        if(n == 2 || n == 3) return true;
        if(n%2 == 0 || n%3 == 0) return false;
        int sqrtN = (int)Math.sqrt(n)+1;
        for(int i = 6; i <= sqrtN; i += 6) {
            if(n%(i-1) == 0 || n%(i+1) == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            boolean isPrime = true;
            System.out.println(isPrime(ele) ? "Prime" : "Not prime");
        }
    }
}
