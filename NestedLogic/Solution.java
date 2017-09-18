import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String expected = sc.nextLine();
        String actual = sc.nextLine();
        sc.close();
        String delims = "[ ]+";
        String[] e = expected.split(delims);
        int eday = Integer.parseInt(e[0]);
        int emonth = Integer.parseInt(e[1]);
        int eyear = Integer.parseInt(e[2]);
        String[] a = actual.split(delims);
        int aday = Integer.parseInt(a[0]);
        int amonth = Integer.parseInt(a[1]);
        int ayear = Integer.parseInt(a[2]);

        int hackos = 0;
        if (eyear > ayear) { 
            hackos += 10000;
        } else if (eyear < ayear) {
          //do nothing 
        } else if(emonth > amonth) {
            hackos += 500 * (emonth - amonth);
        } else if(eday > aday) {
            hackos += 15 * (eday - aday);
        }
        System.out.println(hackos);
    }
}
