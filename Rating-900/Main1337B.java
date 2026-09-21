import java.util.*;

public class Main1337B {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int x = sc.nextInt();
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            // Phase 1: Cast Void Absorption optimally
            // Only use it if we have charges AND it mathematically helps (x > 20)
            while (x > 20 && n > 0) {
                x = (x / 2) + 10;
                n--;
            }
            
            // Phase 2: Finish off with Lightning Strikes
            // m strikes can clear exactly m * 10 remaining hit points
            if (x <= m * 10) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}