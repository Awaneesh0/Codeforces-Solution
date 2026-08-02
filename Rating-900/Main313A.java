import java.util.*;

public class Main313A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        if (n >= 0) {
            System.out.println(n);
        } else {
            int option1 = n / 10;
            
            int lastDigit = n % 10;
            int option2 = (n / 100) * 10 + lastDigit;
            
            System.out.println(Math.max(option1, option2));
        }
        
        sc.close();
    }
}