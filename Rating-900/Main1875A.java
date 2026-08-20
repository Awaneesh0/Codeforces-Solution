import java.util.*;

public class Main1875A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long a = sc.nextLong(); // Max capacity
            long b = sc.nextLong(); // Initial time
            int n = sc.nextInt();   // Number of tools
            
            long totalTime = b;
            
            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();
                
                // The max time we can realistically extract from this tool 
                // is either its full value, or exactly enough to fill the capacity to 'a' 
                // starting from a timer of 1.
                totalTime += Math.min(x, a - 1);
            }
            
            System.out.println(totalTime);
        }
        
        sc.close();
    }
}