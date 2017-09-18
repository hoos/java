import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Data {
    public static void main(String[] args) {
        int T = getRandInt(1, 1000);
        System.out.println(T);
        for (int i = 0; i < T; i++) {
            int N = getRandInt(2, 1000);
            int K = getRandInt(2, N);
            System.out.print(N + " " + K);
        }
    }

    public static int getRandInt(int min, int max) {
        return (int) (Math.random() * max + min);
    }
}
