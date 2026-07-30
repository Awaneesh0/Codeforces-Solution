import java.util.*;

public class Main133A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String p = sc.next();
        
        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);

            if (c == 'H' || c == 'Q' || c == '9') {
                System.out.println("YES");
                return;
            }
        }
        
        System.out.println("NO");
        sc.close();
    }
}