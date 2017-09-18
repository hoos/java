import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {
  
    public static void main(String[] args) {
        String A = "A";
        String B = "B";
        String a = "a";
        String Z = "Z";
        String z = "z";
        String empty = "";

        System.out.println("Comparing A to a : " + A.compareTo(a));
        System.out.println("Comparing A to B : " + A.compareTo(B));
        System.out.println("Comparing Z to z : " + Z.compareTo(z));
        System.out.println("Comparing empty to A : " + empty.compareTo(A));
        System.out.println("Comparing A to empty : " + A.compareTo(empty));
    }
}
