import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            String a = sc.next(); 

            if(a.charAt(1) == '+') { 
                count++;
            } else {
                count--;
            }
        }
        
        System.out.println(count);
        sc.close();
    }
}
