public class Fibonache {

    public static void main(String[] args) {
        System.out.println("Calculating Fibonache for n=" + args[0]);
        int n = Integer.parseInt(args[0]);
        long n1 = 1;
        long n2 = 1;
        long current =2;
        for (int i=3; i <=n; i++) {
            current = n1+n2;
            n2 = n1;
            n1 = current;
        }
        System.out.println("Fibonache =" + current);
    } 
}
