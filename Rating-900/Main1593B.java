import java.util.*;

public class Main1593B {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) {
            return;
        }
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            String s = sc.next();
            
            // The four valid endings for divisibility by 25
            String[] targets = {"00", "25", "50", "75"};
            int minDeletions = Integer.MAX_VALUE;
            
            for (String target : targets) {
                int deletions = getMinDeletions(s, target);
                if (deletions < minDeletions) {
                    minDeletions = deletions;
                }
            }
            
            System.out.println(minDeletions);
        }
        
        sc.close();
    }
    
    // Helper function to find the cost of forming a specific 2-digit target
    private static int getMinDeletions(String s, String target) {
        int len = s.length();
        int idx2 = -1;
        
        // Find the rightmost character of the target (e.g., '5' in "25")
        for (int i = len - 1; i >= 0; i--) {
            if (s.charAt(i) == target.charAt(1)) {
                idx2 = i;
                break;
            }
        }
        
        // If we couldn't find the second digit, this target is impossible
        if (idx2 == -1) {
            return Integer.MAX_VALUE;
        }
        
        int idx1 = -1;
        
        // Find the first character of the target, starting just left of idx2
        for (int i = idx2 - 1; i >= 0; i--) {
            if (s.charAt(i) == target.charAt(0)) {
                idx1 = i;
                break;
            }
        }
        
        // If we couldn't find the first digit, this target is impossible
        if (idx1 == -1) {
            return Integer.MAX_VALUE;
        }
        
        // Formula: digits after idx2 + digits between idx1 and idx2
        return (len - 1 - idx2) + (idx2 - 1 - idx1);
    }
}