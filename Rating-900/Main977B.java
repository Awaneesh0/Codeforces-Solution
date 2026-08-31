import java.util.*;

public class Main977B {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String s = sc.next();
        
        int maxCount = 0;
        String bestTwoGram = "";
        
        // Loop through every valid starting position for a 2-gram
        for (int i = 0; i < n - 1; i++) {
            // Extract the current 2-gram we want to test
            String currentTwoGram = s.substring(i, i + 2);
            int currentCount = 0;
            
            // Scan the entire string to count occurrences of this 2-gram
            for (int j = 0; j < n - 1; j++) {
                if (s.substring(j, j + 2).equals(currentTwoGram)) {
                    currentCount++;
                }
            }
            
            // Update our record if this one appears the most
            if (currentCount > maxCount) {
                maxCount = currentCount;
                bestTwoGram = currentTwoGram;
            }
        }
        
        System.out.println(bestTwoGram);
        
        sc.close();
    }
}