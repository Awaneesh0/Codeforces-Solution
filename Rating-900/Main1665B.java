import java.util.*;

public class Main1665B {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            // O(N) frequency mapping
            Map<Integer, Integer> freqMap = new HashMap<>();
            int maxFreq = 0;
            
            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                int count = freqMap.getOrDefault(val, 0) + 1;
                freqMap.put(val, count);
                
                // Track the highest frequency dynamically
                if (count > maxFreq) {
                    maxFreq = count;
                }
            }
            
            // The total swap operations are mathematically locked
            int totalSwaps = n - maxFreq;
            int totalClones = 0;
            
            // Calculate how many times we need to double our stash
            int currentStash = maxFreq;
            while (currentStash < n) {
                totalClones++;
                currentStash *= 2;
            }
            
            // The final answer is strictly the sum of the two decoupled actions
            System.out.println(totalSwaps + totalClones);
        }
        
        sc.close();
    }
}