import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int n[];
        for (int i = 0; i < t; i++) {
            n = new int[in.nextInt()];
            for (int j = 0; j < n.length; j++) {
                n[j] = in.nextInt();
            }
            System.out.println(getNoOps(n));
        }
    }

    public static int getNoOps(int[] n) {
        int min = n[0];
        for(int i = 0; i < n.length; i++) {
           if(min > n[i]) {
               min = n[i];
           }
        }

        int minopps = Integer.MAX_VALUE;
        int delta[] = new int[n.length]; 
        int target = min + 2;
        while(loop >=0) {
            int opps = 0;
            //Get the delta of n[] and target
            for (int i = 0; i < n.length; i++) {
                delta[i] = n[i] - min;            
                opps += (delta[i]/5) + ((delta[i]%5))/2 + ((delta[i]%5)%2)/1;
            } 
            if (minopps > opps) {
                    minopps = opps;
            }
            min--;
            target--;
        }
        
        return minopps;
    }

}
