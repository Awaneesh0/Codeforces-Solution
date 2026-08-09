import java.util.*;

public class Main1850D {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            // Step 1: Sort to minimize adjacent differences
            Arrays.sort(a);
            
            int maxStreak = 1;
            int currentStreak = 1;
            
            // Step 2: Track the longest valid subsegment
            for (int i = 1; i < n; i++) {
                if (a[i] - a[i - 1] <= k) {
                    currentStreak++;
                    
                    // Immediately update maxStreak (avoids the "Never Drops" trap!)
                    if (currentStreak > maxStreak) {
                        maxStreak = currentStreak;
                    }
                } else {
                    // The gap is too big. The streak resets.
                    currentStreak = 1;
                }
            }
            
            // Step 3: Total problems minus the ones we keep = the ones we remove
            System.out.println(n - maxStreak);
        }
        
        sc.close();
    }
}