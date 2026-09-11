import java.util.*;

public class Main1471A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            long x = sc.nextLong();
            
            long totalSum = 0;
            long maxBeauty = 0;
            
            for (int i = 0; i < n; i++) {
                long val = sc.nextLong();
                
                // Track the total sum for the minimum beauty calculation
                totalSum += val;
                
                // Calculate individual ceilings for the maximum beauty
                maxBeauty += (val + x - 1) / x;
            }
            
            // Calculate the ceiling of the massive merged sum
            long minBeauty = (totalSum + x - 1) / x;
            
            System.out.println(minBeauty + " " + maxBeauty);
        }
        
        sc.close();
    }
}