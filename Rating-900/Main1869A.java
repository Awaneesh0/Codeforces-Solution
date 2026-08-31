import java.util.*;

public class Main1869A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            // Read and immediately discard the array elements
            for (int i = 0; i < n; i++) {
                sc.nextInt();
            }
            
            if (n % 2 == 0) {
                // For even length arrays: 2 operations
                System.out.println(2);
                System.out.println("1 " + n);
                System.out.println("1 " + n);
            } else {
                // For odd length arrays: 4 operations
                System.out.println(4);
                
                // Nuke the first n-1 elements
                System.out.println("1 " + (n - 1));
                System.out.println("1 " + (n - 1));
                
                // Nuke the final 2 elements
                System.out.println((n - 1) + " " + n);
                System.out.println((n - 1) + " " + n);
            }
        }
        
        sc.close();
    }
}