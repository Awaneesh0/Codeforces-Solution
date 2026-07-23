import java.util.*;

public class Main59A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        int uc = 0;
        int ic = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                uc++;
            } else {
                ic++;
            }
        }
        
        if (uc > ic) {
            System.out.println(s.toUpperCase());
        } else {
            System.out.println(s.toLowerCase());
        }
        
        sc.close();
    }
}