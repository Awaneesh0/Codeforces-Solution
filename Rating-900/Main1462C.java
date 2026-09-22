import java.util.*;

public class Main1462C {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int x = sc.nextInt();
            
            // The absolute maximum sum of unique digits (1+2+...+9) is 45
            if (x > 45) {
                System.out.println("-1");
                continue;
            }
            
            StringBuilder result = new StringBuilder();
            
            // Greedily take the largest possible digits first to minimize total digits
            for (int i = 9; i >= 1; i--) {
                if (x >= i) {
                    result.append(i);
                    x -= i;
                } else if (x > 0) {
                    result.append(x);
                    x = 0;
                }
            }
            
            // Since we built the number with largest digits first (for the right side),
            // we reverse the string to put the smallest digits on the left.
            System.out.println(result.reverse().toString());
        }
        
        sc.close();
    }
}