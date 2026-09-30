import java.util.*;

public class Main_2132B {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long n = sc.nextLong();
            
            List<Long> validX = new ArrayList<>();
            
            // k represents the number of zeros appended. 
            // We iterate backwards from 18 down to 1.
            long powerOf10 = 1_000_000_000_000_000_000L; 
            for (int k = 18; k >= 1; k--) {
                long denominator = powerOf10 + 1;
                
                // If n is perfectly divisible by (10^k + 1), we found a valid x
                if (n % denominator == 0) {
                    validX.add(n / denominator);
                }
                
                // Shift down by one power of 10 for the next iteration
                powerOf10 /= 10;
            }
            
            // Output the count of valid numbers, followed by the numbers themselves
            System.out.print(validX.size());
            for (long x : validX) {
                System.out.print(" " + x);
            }
            System.out.println();
        }
        
        sc.close();
    }
}