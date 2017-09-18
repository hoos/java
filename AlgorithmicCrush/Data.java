import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Data {
    public static void main(String[] args) {
        int N = (int) Math.pow(10,7) - 1;
        int M = (int) Math.pow(10,5) * 2 - 1;
        int a = 1;
        int b = N-1;
        int k = N-1;
        System.out.println("N=" + N + " M=" + M + " a=" + a + " b=" +  b +  " k=" + k);
     
   		BufferedWriter bw = null;
		FileWriter fw = null;
        try {
       		fw = new FileWriter("inputLargest.txt");
			bw = new BufferedWriter(fw);
            String firstLine = new String(N + " " + M + "\n");
			bw.write(firstLine);
            for (int i = 0; i < M; i++) {
                bw.write(a + " " + b + " " + k + "\n");
            }
       	} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
				if (fw != null)
					fw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
    }
}
