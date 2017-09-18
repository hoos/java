import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Data {
    public static void main(String[] args) {
        int q = 500;
   		BufferedWriter bw = null;
		FileWriter fw = null;
        try {
       		fw = new FileWriter(args[0]);
			bw = new BufferedWriter(fw);
            String firstLine = new String(q + "\n");
			bw.write(firstLine);
            for (int i = 0; i < q; i++) {
                bw.write(getRandInt(1, 50) + " " + getRandInt(1, 50) + " " +  getRandInt(1, 15)+ "\n");
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
