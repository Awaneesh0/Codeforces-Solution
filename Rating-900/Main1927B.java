import java.util.*;

public class Main1927B {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            // Our constant O(1) space frequency tracker for the 26 letters
            int[] count = new int[26];
            StringBuilder sb = new StringBuilder();
            
            for (int i = 0; i < n; i++) {
                int trace = sc.nextInt();
                
                // Scan the alphabet to find the first letter that matches the trace requirement
                for (int j = 0; j < 26; j++) {
                    if (count[j] == trace) {
                        // Append the physical character
                        sb.append((char) ('a' + j));
                        
                        // Increment its frequency so we know it has appeared one more time
                        count[j]++;
                        
                        // Stop searching and move to the next input number
                        break;
                    }
                }
            }
            
            System.out.println(sb.toString());
        }
        
        sc.close();
    }
}