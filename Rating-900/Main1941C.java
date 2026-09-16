import java.util.*;

public class Main1941C {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            char[] arr = s.toCharArray();
            
            int deletions = 0;
            
            // We only need to check up to n - 3 for "map" or "pie"
            for (int i = 0; i < n - 2; ) {
                
                // Priority 1: Check for the 5-letter overlap trap first
                if (i + 4 < n && arr[i] == 'm' && arr[i+1] == 'a' && arr[i+2] == 'p' && arr[i+3] == 'i' && arr[i+4] == 'e') {
                    deletions++;
                    i += 5; // Jump completely past the destroyed words
                } 
                // Priority 2: Check for standalone "map"
                else if (arr[i] == 'm' && arr[i+1] == 'a' && arr[i+2] == 'p') {
                    deletions++;
                    i += 3;
                } 
                // Priority 3: Check for standalone "pie"
                else if (arr[i] == 'p' && arr[i+1] == 'i' && arr[i+2] == 'e') {
                    deletions++;
                    i += 3;
                } 
                // No pattern found, just advance by 1
                else {
                    i++;
                }
            }
            
            System.out.println(deletions);
        }
        
        sc.close();
    }
}