import java.util.*;

public class Main1339A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            // Read the input
            int n = sc.nextInt();
            
            // The number of ways to tile the diamond is exactly n
            System.out.println(n);
        }
        
        sc.close();
    }
}