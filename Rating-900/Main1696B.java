import java.util.*;

public class Main1696B {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            int segments = 0;
            int prev = 0;
            
            for (int i = 0; i < n; i++) {
                int current = sc.nextInt();
                
                // If we see a non-zero element, and the one right before it was a 0,
                // we have discovered a new isolated block.
                if (current != 0 && prev == 0) {
                    segments++;
                }
                
                // Update previous for the next iteration
                prev = current;
            }
            
            // The maximum number of operations required is always capped at 2
            System.out.println(Math.min(segments, 2));
        }
        
        sc.close();
    }
}