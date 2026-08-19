import java.util.*;

public class Main460A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int days = 0;
        
        // Keep going as long as he has at least 1 pair of socks to put on
        while (n > 0) {
            days++; // A new day starts
            n--;    // He puts on a pair and throws it away in the evening
            
            // Late in the evening, if it's the m-th day, Mom buys a new pair
            if (days % m == 0) {
                n++;
            }
        }
        
        System.out.println(days);
        
        sc.close();
    }
}