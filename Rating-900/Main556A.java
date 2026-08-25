import java.util.*;

public class Main556A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String s = sc.next();
        
        int count0 = 0;
        int count1 = 0;
        
        // Tally up the total zeros and ones
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                count0++;
            } else {
                count1++;
            }
        }
        
        // The remaining string length is just the surplus of the more frequent character
        System.out.println(Math.abs(count0 - count1));
        
        sc.close();
    }
}