import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
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
        System.out.println(m);
        System.out.println(Math.floor((m/2)));
        System.out.println(Math.ceil((m*m)/2));
        for(int i = 0; i < m; i++) {
            System.out.print(grid[i]);
        }
        
    }
}
