import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {
static void displayPathtoPrincess(int n, String [] grid){
  }
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m;
        m = in.nextInt();
        String grid[] = new String[m];
        for(int i = 0; i < m; i++) {
            grid[i] = in.next();
        }

    displayPathtoPrincess(m,grid);
        int rightedge = (int) Math.floor(m/2);
        int start = (int) Math.ceil((m*m)/2);
        int pos = start;
        //Hit the right edge, follow around clockwise
        while(pos < start + rightedge) {
            System.out.println("RIGHT");
            pos++;
        }
    
        //Bottom Right
        while(pos < (m*m) -1) {
            pos += m;
            System.out.println("DOWN");
        } 
        if (grid[2].charAt(2) == 'p') {
            System.exit(0);
        }
    
        //Bottom Left
        while(pos > (m-1)) {
            pos -= m;
            System.out.println("LEFT");
        }
        if (grid[2].charAt(0) == 'p') {
            System.exit(0);
        }
    
        //Top Left
        while(pos != (0)) {
            pos--;
            System.out.println("UP");
        }
        if (grid[0].charAt(0) == 'p') {
            System.exit(0);
        }
    
        //Top Right
        while(pos < (m-1)) {
            pos++;
            System.out.println("RIGHT");
        }
        if (grid[2].charAt(2) == 'p') {
            System.exit(2);
        }
    }
}
