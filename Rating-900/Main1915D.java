import java.util.*;

public class Main1915D {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            
            StringBuilder result = new StringBuilder();
            
            // Pointer starts at the end of the string
            for (int i = n - 1; i >= 0; ) {
                char c = s.charAt(i);
                
                // If it's a vowel, the syllable is strictly CV (length 2)
                if (c == 'a' || c == 'e') {
                    result.append(s.charAt(i));
                    result.append(s.charAt(i - 1));
                    i -= 2; // Jump pointer by 2
                } 
                // If it's a consonant, the syllable is strictly CVC (length 3)
                else {
                    result.append(s.charAt(i));
                    result.append(s.charAt(i - 1));
                    result.append(s.charAt(i - 2));
                    i -= 3; // Jump pointer by 3
                }
                
                // Add a dot separator if there are still characters left to process
                if (i >= 0) {
                    result.append('.');
                }
            }
            
            // Since we built the string backwards, reverse it before printing
            System.out.println(result.reverse().toString());
        }
        
        sc.close();
    }
}