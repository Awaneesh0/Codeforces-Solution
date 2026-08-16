import java.util.*;

public class Main1373B {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            String s = sc.next();
            
            int count0 = 0;
            int count1 = 0;
            
            // Tally the frequencies of 0s and 1s
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    count0++;
                } else {
                    count1++;
                }
            }
            
            // The game lasts exactly this many turns
            int maxMoves = Math.min(count0, count1);
            
            // Alice makes all the odd-numbered moves (1st, 3rd, 5th...)
            if (maxMoves % 2 != 0) {
                System.out.println("DA");
            } else {
                System.out.println("NET");
            }
        }
        
        sc.close();
    }
}