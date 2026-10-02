import java.util.*;

public class Main1535B {
    
    // Standard Euclidean algorithm for GCD
    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            // O(N) Array Segregation
            int[] arr = new int[n];
            int left = 0;
            int right = n - 1;
            
            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                if (val % 2 == 0) {
                    arr[left++] = val; // Evens to the front
                } else {
                    arr[right--] = val; // Odds to the back
                }
            }
            
            int validPairs = 0;
            
            // O(N^2) pairwise check on the optimized arrangement
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    // We only need to compute the actual GCD if the first number is odd.
                    // If the first number is even, the formula mathematically guarantees success.
                    if (arr[i] % 2 == 0) {
                        validPairs++;
                    } else if (gcd(arr[i], 2 * arr[j]) > 1) {
                        validPairs++;
                    }
                }
            }
            
            System.out.println(validPairs);
        }
        
        sc.close();
    }
}