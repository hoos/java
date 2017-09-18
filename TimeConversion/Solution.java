import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        int hour = 0;
        String hh= "";
        String mm = "";
        String ss = "";
        String tfhour = "";

        hh = s.substring(0,2);
        mm = s.substring(3,5);
        ss = s.substring(6,8);
        //System.out.println("hh=" + hh + " mm=" + mm + " ss=" + ss);
        if (s.matches(".*AM")) {
            //System.out.println("Found AM");
            hour = Integer.parseInt(hh);
            if (hour == 12) {
                hour = 00;
            }
            tfhour = new String(Integer.toString(hour) + ":" + mm  + ":" + ss);
        } else {
            //System.out.println("Found PM");
            tfhour = new String(hh + ":" + mm + ":" + ss);
        }
        return tfhour;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
