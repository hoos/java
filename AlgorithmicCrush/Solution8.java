import java.util.*;

public class Solution8 {

public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        long list[] = new long[N];
        
        for(int i = 0; i<M; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            long k = in.nextLong();
            
            // Add k to the a-1 element
            list[a-1] +=k;

            // Subtract K from element indexed beyond b
            if(b<N){
                list[b] -=k; 
            }
        }
        
        long maxValue = 0;
        long sum = 0;
        for(int j = 0; j < N; j++){
            sum = sum+list[j];
            if(maxValue < sum) {
                 maxValue = sum;
            }
        }
        System.out.println(maxValue);
    }
}
