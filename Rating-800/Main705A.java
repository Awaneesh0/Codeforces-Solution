import java.util.*;

public class Main705A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(getFeelings(1, n));
        
        sc.close();
    }
    
    static String getFeelings(int current, int n) {
        if (current == n) {
            if (current % 2 != 0) {
                return "I hate it";
            } else {
                return "I love it";
            }
        }

        if (current % 2 != 0) {
            return "I hate that " + getFeelings(current + 1, n);
        } else {
            return "I love that " + getFeelings(current + 1, n);
        }
    }
}