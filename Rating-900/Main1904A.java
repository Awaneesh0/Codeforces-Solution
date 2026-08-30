import java.util.*;

public class Main1904A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int xK = sc.nextInt();
            int yK = sc.nextInt();
            
            int xQ = sc.nextInt();
            int yQ = sc.nextInt();
            
            // All 8 possible move combinations for an a x b knight
            int[] dx = {a, a, -a, -a, b, b, -b, -b};
            int[] dy = {b, -b, b, -b, a, -a, a, -a};
            
            Set<String> kingThreats = new HashSet<>();
            Set<String> queenThreats = new HashSet<>();
            
            // Calculate where the knight must be to attack the King and Queen
            for (int i = 0; i < 8; i++) {
                kingThreats.add((xK + dx[i]) + "," + (yK + dy[i]));
                queenThreats.add((xQ + dx[i]) + "," + (yQ + dy[i]));
            }
            
            int forkCount = 0;
            
            // Check for the intersection of the two sets
            for (String pos : kingThreats) {
                if (queenThreats.contains(pos)) {
                    forkCount++;
                }
            }
            
            System.out.println(forkCount);
        }
        
        sc.close();
    }
}