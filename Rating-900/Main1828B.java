import java.util.*;

public class Main1828B {
    
    // Classic Euclidean Algorithm for Greatest Common Divisor
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int maxK = 0;
            
            // Use 1-based indexing for the loop to match the permutation values perfectly
            for (int i = 1; i <= n; i++) {
                int p = sc.nextInt();
                
                // Calculate how far the number is from its correct home
                int distance = Math.abs(p - i);
                
                // If it is misplaced, factor its distance into our running GCD
                if (distance > 0) {
                    maxK = gcd(maxK, distance);
                }
            }
            
            System.out.println(maxK);
        }
        
        sc.close();
    }
}