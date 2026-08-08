import java.util.*;

public class Main34B {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); 
        int m = sc.nextInt(); 
        
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        
        // most negative values at the front
        Arrays.sort(prices);
        
        int totalEarnings = 0;
        
        for (int i = 0; i < m; i++) {
            
            // Only take the TV if the price is negative
            if (prices[i] < 0) {
                // Absolute value of the negative price
                totalEarnings += Math.abs(prices[i]);
            } else {
                break;
            }
        }
        
        System.out.println(totalEarnings);
        
        sc.close();
    }
}