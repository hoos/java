import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            if(((K-1)|K) > N && K%2==0){
                System.out.println(K-2);
            }else{
                System.out.println(K-1);               
            }
        }
    }
}
