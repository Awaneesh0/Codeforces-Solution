import java.util.*;

public class Main1343A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            // k must be strictly greater than 1, so we start at 2
            // 2^30 is well over 10^9, so we only need to check up to 30
            for (int k = 2; k <= 30; k++) {
                
                // (1 << k) computes 2^k instantly
                int divisor = (1 << k) - 1;
                
                // If n is perfectly divisible, we found our x!
                if (n % divisor == 0) {
                    System.out.println(n / divisor);
                    break;
                }
            }
        }
        
        sc.close();
    }
}