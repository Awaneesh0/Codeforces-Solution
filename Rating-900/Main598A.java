import java.util.*;

public class Main598A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long n = sc.nextLong();
            
            // Step 1: Calculate the standard sum of 1 to n
            long sum = n * (n + 1) / 2;
            
            // Step 2: Fix the error for the powers of 2
            // We iterate in O(log N) time by multiplying by 2 each step
            long powerOf2 = 1;
            while (powerOf2 <= n) {
                // Since we added it instead of subtracting, we must subtract it twice to fix the sum
                sum -= (powerOf2 * 2);
                
                // Advance to the next power of 2
                powerOf2 *= 2;
            }
            
            System.out.println(sum);
        }
        
        sc.close();
    }
}