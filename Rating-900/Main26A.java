import java.util.*;

public class Main26A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Check if there is input, handling empty edge cases
        if (!sc.hasNextInt()) {
            return;
        }
        int n = sc.nextInt();
        
        // Array to store the number of distinct prime factors for each number
        int[] primeCount = new int[n + 1];
        
        // Modified Sieve of Eratosthenes
        for (int i = 2; i <= n; i++) {
            
            // If the count is 0, no previous prime has divided it, so 'i' itself is prime
            if (primeCount[i] == 0) {
                
                // Add this prime as a distinct factor to all of its multiples
                for (int j = i; j <= n; j += i) {
                    primeCount[j]++;
                }
            }
        }
        
        int almostPrimes = 0;
        
        // Simply count how many numbers received exactly 2 prime visits
        for (int i = 1; i <= n; i++) {
            if (primeCount[i] == 2) {
                almostPrimes++;
            }
        }
        
        System.out.println(almostPrimes);
        
        sc.close();
    }
}