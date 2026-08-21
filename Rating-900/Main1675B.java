import java.util.*;

public class Main1675B {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            
            int operations = 0;
            boolean possible = true;
            
            // Loop backwards starting from the second-to-last element
            for (int i = n - 2; i >= 0; i--) {
                
                // While the current element is too big, and hasn't hit 0 yet
                while (a[i] >= a[i + 1] && a[i] > 0) {
                    a[i] /= 2;
                    operations++;
                }
                
                // If it is STILL not strictly less than the element to its right,
                // it means a[i+1] was 0, so a[i] needed to be negative.
                if (a[i] >= a[i + 1]) {
                    possible = false;
                    break;
                }
            }
            
            if (possible) {
                System.out.println(operations);
            } else {
                System.out.println("-1");
            }
        }
        
        sc.close();
    }
}