import java.util.*;

public class Main567A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        
        int n = sc.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            int min, max;
            
            // Edge Case 1: The very first city (only has a right neighbor)
            if (i == 0) {
                min = a[1] - a[0];
                max = a[n - 1] - a[0];
            } 
            // Edge Case 2: The very last city (only has a left neighbor)
            else if (i == n - 1) {
                min = a[n - 1] - a[n - 2];
                max = a[n - 1] - a[0];
            } 
            // Standard Case: Cities in the middle of the line
            else {
                // Min is the closest of the two immediate neighbors
                min = Math.min(a[i] - a[i - 1], a[i + 1] - a[i]);
                // Max is the furthest of the two absolute endpoints
                max = Math.max(a[i] - a[0], a[n - 1] - a[i]);
            }
            
            System.out.println(min + " " + max);
        }
        
        sc.close();
    }
}