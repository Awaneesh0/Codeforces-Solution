import java.util.*;

public class Main1726A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            // If the array only has 1 element, the difference is always 0
            if (n == 1) {
                System.out.println(0);
                continue;
            }
            
            // Default baseline: do absolutely nothing
            int maxDiff = a[n - 1] - a[0]; 
            
            // Case 1: Fix the first element, find the best element to rotate to the back
            for (int i = 1; i < n; i++) {
                maxDiff = Math.max(maxDiff, a[i] - a[0]);
            }
            
            // Case 2: Fix the last element, find the best element to rotate to the front
            for (int i = 0; i < n - 1; i++) {
                maxDiff = Math.max(maxDiff, a[n - 1] - a[i]);
            }
            
            // Case 3: Rotate the entire array, turning any adjacent pair into the new endpoints
            for (int i = 0; i < n - 1; i++) {
                maxDiff = Math.max(maxDiff, a[i] - a[i + 1]);
            }
            
            System.out.println(maxDiff);
        }
        
        sc.close();
    }
}