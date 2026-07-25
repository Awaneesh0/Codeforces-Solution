import java.util.*;

public class Main1328A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int rem = a % b;
            
            if (rem == 0) {
                System.out.println(0);
            } else {
                System.out.println(b - rem);
            }
        }
        
        sc.close();
    }
}