import java.util.*;

public class Main1855B {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long n = sc.nextLong();
            
            long maxIntervalSize = 0;
            
            // Start checking from 1 onwards
            for (long i = 1; ; i++) {
                // If n is perfectly divisible by i, our interval grows
                if (n % i == 0) {
                    maxIntervalSize++;
                } else {
                    // The moment a number doesn't divide n, the streak breaks
                    break;
                }
            }
            
            System.out.println(maxIntervalSize);
        }
        
        sc.close();
    }
}