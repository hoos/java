import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            if (i<n) {
                int result = a;
                for (int j=0; j<n; j++) {
                    result += getSeries(a, j, b);
                    System.out.printf("%d ", result);
                }
                System.out.println(); 
            } else {
                int result = a;
                for (int j=0; j<n; j++) {
                    result += getSeries(a, j, b);
                    System.out.printf("%d ", result);
                }
                 System.out.println();
            }  
        }
        in.close();
    }
    
    public static int getSeries(int a, int j, int b) {
        //System.out.println("a=" + a + " b=" + b + " j=" + j);
        return  (((int) Math.pow(2,j)) * b);
    }
}
