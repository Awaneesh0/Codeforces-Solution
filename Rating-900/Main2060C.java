import java.util.*;

public class Main2060C {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            // Step 1: Sort the array to enable the Two-Pointer strategy
            Arrays.sort(a);
            
            int left = 0;
            int right = n - 1;
            int score = 0;
            
            // Step 2: Squeeze the array from both sides
            while (left < right) {
                int sum = a[left] + a[right];
                
                if (sum == k) {
                    // Match found! Bob scores, and both numbers are consumed.
                    score++;
                    left++;
                    right--;
                } else if (sum < k) {
                    // Sum is too small, increase the lower bound
                    left++;
                } else {
                    // Sum is too large, decrease the upper bound
                    right--;
                }
            }
            
            System.out.println(score);
        }
        
        sc.close();
    }
}