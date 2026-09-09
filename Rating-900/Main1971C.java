import java.util.*;

public class Main1971C {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            
            // Standardize Alice's arc boundaries
            int minA = Math.min(a, b);
            int maxA = Math.max(a, b);
            
            // Check if Bob's points fall inside Alice's arc
            boolean cInside = (c > minA && c < maxA);
            boolean dInside = (d > minA && d < maxA);
            
            // The strings intersect if and only if exactly one point is inside
            if (cInside != dInside) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}