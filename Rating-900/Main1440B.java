import java.util.*;

public class Main1440B {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            
            long N = n * k;
            long y = (n / 2) + 1; // The exact size of the right-side block consumed by each median
            
            long maxSum = 0;
            
            // Process the stream dynamically in O(1) auxiliary space
            for (long j = 0; j < N; j++) {
                long val = sc.nextLong();
                
                // If the current index aligns with our mathematical median targets, capture it
                if (j >= N - (k * y) && (N - j) % y == 0) {
                    maxSum += val;
                }
            }
            
            System.out.println(maxSum);
        }
        
        sc.close();
    }
}