//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        // Declare a String to String map
        Map<String, Integer> myMap; 
        // Initialize it as a new String to String HashMap
        myMap = new HashMap<String, Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            myMap.put(name, new Integer(phone));
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(myMap.containsKey(s)) {
                System.out.println(s + "="  + myMap.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}

