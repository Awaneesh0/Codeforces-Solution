import java.util.*;

public class Main1794B{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Handle potential empty input gracefully
        if (!sc.hasNextInt()) {
            return;
        }
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            
            // Pass 1: Read the array and completely eliminate the '1' trap
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] == 1) {
                    a[i]++;
                }
            }
            
            // Pass 2: Ensure no element perfectly divides the element to its right
            for (int i = 0; i < n - 1; i++) {
                if (a[i + 1] % a[i] == 0) {
                    a[i + 1]++;
                }
            }
            
            // Print the optimized array
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + (i == n - 1 ? "" : " "));
            }
            System.out.println();
        }
        
        sc.close();
    }
}