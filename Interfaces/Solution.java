import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
   int divisorSum(int n);
}

//Write your code here
class Calculator implements AdvancedArithmetic {
    
    public int divisorSum(int n) {
    if (n==1)
        return n;
    int maxD = (int)Math.sqrt(n);
    int sum=1;
    for(int i = 2; i <= maxD; i++) {
        if(n % i == 0) {
           sum += i;
           int d = n/i;
           if(d!=i)
              sum+=d;
        }
    }
    return sum + n;
    }  
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
