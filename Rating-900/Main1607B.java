import java.util.*;

public class Main1607B {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long x0 = sc.nextLong();
            long n = sc.nextLong();
            
            long displacement = 0;
            long remainder = n % 4;
            
            // Calculate the displacement as if we started on an even number
            if (remainder == 1) {
                displacement = -n;
            } else if (remainder == 2) {
                displacement = 1;
            } else if (remainder == 3) {
                displacement = n + 1;
            } 
            // If remainder is 0, displacement remains 0
            
            // If the starting position is actually odd, invert the entire movement
            if (Math.abs(x0) % 2 == 1) {
                displacement = -displacement;
            }
            
            // Apply the final displacement to the starting coordinate
            System.out.println(x0 + displacement);
        }
        
        sc.close();
    }
}