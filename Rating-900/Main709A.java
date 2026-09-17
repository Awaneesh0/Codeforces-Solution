import java.util.*;

public class Main709A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        
        int n = sc.nextInt();
        long b = sc.nextLong(); // Maximum acceptable orange size
        long d = sc.nextLong(); // Maximum waste capacity
        
        long waste = 0;
        int emptyCount = 0;
        
        for (int i = 0; i < n; i++) {
            long orange = sc.nextLong();
            
            // If the orange is too big, it doesn't fit in the juicer. 
            // We ignore it completely.
            if (orange > b) {
                continue;
            }
            
            // Otherwise, squeeze it and add to the waste accumulator
            waste += orange;
            
            // If the waste strictly exceeds the capacity, empty the juicer
            if (waste > d) {
                emptyCount++;
                waste = 0; // Reset the waste to 0 after emptying
            }
        }
        
        System.out.println(emptyCount);
        
        sc.close();
    }
}