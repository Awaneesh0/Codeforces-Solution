import java.util.*;

public class Main116A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int count = 0;
        int maxValue = 0;
        
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt(); 
            int b = sc.nextInt(); 
            
            count = count - a + b;
            
            if (count > maxValue) {
                maxValue = count;
            }
        }
        
        System.out.println(maxValue);
        
        sc.close();
    }
}