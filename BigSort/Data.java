import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Data {
    public static void main(String[] args) {
        int q = 1000000;
   		BufferedWriter bw = null;
		FileWriter fw = null;
        try {
       		fw = new FileWriter(args[0]);
			bw = new BufferedWriter(fw);
            String firstLine = new String(q + "\n");
			bw.write(firstLine);
            for (int i = 0; i < q; i++) {
                bw.write(Integer.toString(getRandInt(1, Integer.MAX_VALUE)) + Integer.toString(getRandInt(1, Integer.MAX_VALUE)));
                bw.write(Integer.toString(getRandInt(1, Integer.MAX_VALUE)) + Integer.toString(getRandInt(1, Integer.MAX_VALUE)));
                bw.write(Integer.toString(getRandInt(1, Integer.MAX_VALUE)) + Integer.toString(getRandInt(1, Integer.MAX_VALUE)) + "\n");
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

    public static int getRandInt(int min, int max) {
        return (int) (Math.random() * max + min);
    }
}
