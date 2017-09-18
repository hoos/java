import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] edges = new int[m][2];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 2; j++) {
                edges[i][j] = in.nextInt();
            }
        }
        //System.out.println(Arrays.deepToString(edges));
        int count = 0;
        for (int j = 0; j < m; j++) {
            for (int k = 0; k < 2; k++) {
                /*if(edges[j][k] == 2) {
                    count++;
                }*/        
                if(k == 0) {
                  System.out.print("[" + edges[j][k]  + "]");
                } else {
                  System.out.println("[" +  edges[j][k] + "]");
                }
            }
        }
    }
}
