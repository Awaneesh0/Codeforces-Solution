import java.util.*;

public class Main1985D {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            int topRow = -1;
            int bottomRow = -1;
            int centerCol = -1;
            
            for (int i = 1; i <= n; i++) {
                String row = sc.next();
                
                // Scan the current row for any '#'
                for (int j = 1; j <= m; j++) {
                    if (row.charAt(j - 1) == '#') {
                        
                        // If this is the very first '#' we've seen, it's the top tip!
                        if (topRow == -1) {
                            topRow = i;
                            centerCol = j; // The tip perfectly aligns with the center column
                        }
                        
                        // Continuously update the bottom row
                        bottomRow = i;
                    }
                }
            }
            
            // The center row is exactly halfway between the top and bottom tips
            int centerRow = (topRow + bottomRow) / 2;
            
            System.out.println(centerRow + " " + centerCol);
        }
        
        sc.close();
    }
}