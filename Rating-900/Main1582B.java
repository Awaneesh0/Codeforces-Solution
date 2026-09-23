import java.util.*;

public class Main1582B {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            int count0 = 0;
            int count1 = 0;
            
            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                if (val == 0) {
                    count0++;
                } else if (val == 1) {
                    count1++;
                }
            }
            
            // Calculate c1 * (2 ^ c0) using a 64-bit bitwise shift
            long combinations = (long) count1 * (1L << count0);
            
            System.out.println(combinations);
        }
        
        sc.close();
    }
}