import java.util.*;

public class Solution {

    static int B;
    static int H;
    static boolean flag;

    static {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            B = sc.nextInt();
            H = sc.nextInt();
            if(B > 0 && H > 0) {
                flag = true;
            } else {
                //throw new RuntimeException("Breadth and height must be positive");
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            }
        }
    }

    public static void main(String[] args){
            if(flag){
                int area=B*H;
                System.out.print(area);
            }
            
    }//end of main
}
