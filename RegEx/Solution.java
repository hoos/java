import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<String> names = new ArrayList<String>();
        for (int i = 0; i < t; i++) {
            String name = sc.next();
            String email = sc.next();
            if (email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@gmail.com")) 
                names.add(name);
        }
        Collections.sort(names, String.CASE_INSENSITIVE_ORDER);
        for (String name : names) {
             System.out.println(name);
        }
    }
}
