import java.util.*;

public class Main1837B {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            
            int maxStreak = 1;
            int currentStreak = 1;
            
            // Loop through the string to find the longest identical streak
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    currentStreak++;
                    
                    // Immediately update maxStreak to avoid the "never drops" trap
                    if (currentStreak > maxStreak) {
                        maxStreak = currentStreak;
                    }
                } else {
                    // The character changed (e.g., from '<' to '>'), streak breaks
                    currentStreak = 1;
                }
            }
            
            // The cost is always the longest streak + 1
            System.out.println(maxStreak + 1);
        }
        
        sc.close();
    }
}