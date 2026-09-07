import java.util.*;

public class Main1335B {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            StringBuilder sb = new StringBuilder();
            
            // Loop n times to build the full string
            for (int i = 0; i < n; i++) {
                // i % b keeps cycling from 0 to b-1
                // We add that to 'a' to cycle through the first b characters
                sb.append((char) ('a' + (i % b)));
            }
            
            System.out.println(sb.toString());
        }
        
        sc.close();
    }
}