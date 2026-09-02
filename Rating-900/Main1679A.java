import java.util.*;

public class Main1679A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long n = sc.nextLong();
            
            // If n is odd or strictly less than a single 4-tire bus
            if (n % 2 != 0 || n < 4) {
                System.out.println("-1");
            } else {
                long minBuses = n / 6;
                if (n % 6 != 0) {
                    minBuses++; // Add 1 if there is any remainder
                }
                
                long maxBuses = n / 4;
                
                System.out.println(minBuses + " " + maxBuses);
            }
        }
        
        sc.close();
    }
}