import java.util.*;

public class Main320A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        boolean isMagic = true;
        
        // Rule 1: Check for any illegal digits
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '1' && s.charAt(i) != '4') {
                isMagic = false;
                break;
            }
        }
        
        // Rule 2: It cannot start with a 4
        if (s.charAt(0) == '4') {
            isMagic = false;
        }
        
        // Rule 3: It can never contain three 4s in a row
        if (s.contains("444")) {
            isMagic = false;
        }
        
        if (isMagic) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        sc.close();
    }
}