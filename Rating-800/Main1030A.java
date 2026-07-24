import java.util.*;

public class Main1030A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int response = sc.nextInt();
            
            if (response == 1) {
                System.out.println("HARD");
                return; 
            }
        }

        System.out.println("EASY");
        
        sc.close();
    }
}