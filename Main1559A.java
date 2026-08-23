import java.util.*;

public class Main1559A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            // Read the very first element to start our chain
            int result = sc.nextInt();
            
            // Bitwise AND it with every other element in the array
            for (int i = 1; i < n; i++) {
                result &= sc.nextInt();
            }
            
            // The final accumulated result is the minimum possible maximum!
            System.out.println(result);
        }
        
        sc.close();
    }
}