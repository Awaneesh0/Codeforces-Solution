import java.util.*;

public class Main1543A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            
            if (a == b) {
                // If they are equal, the max GCD is infinite (0) and requires 0 steps
                System.out.println("0 0");
            } else {
                long maxGcd = Math.abs(a - b);
                
                // Calculate steps to the nearest multiple down and up
                long stepDown = a % maxGcd;
                long stepUp = maxGcd - stepDown;
                
                long minSteps = Math.min(stepDown, stepUp);
                
                System.out.println(maxGcd + " " + minSteps);
            }
        }
        
        sc.close();
    }
}