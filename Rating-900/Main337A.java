import java.util.*;

public class Main337A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); 
        int m = sc.nextInt();
        
        int[] puzzles = new int[m];
        for (int i = 0; i < m; i++) {
            puzzles[i] = sc.nextInt();
        }
        
        Arrays.sort(puzzles);
        
        int minDifference = Integer.MAX_VALUE;
        
        for (int i = 0; i <= m - n; i++) {
            
            int currentDifference = puzzles[i + n - 1] - puzzles[i];
            
            if (currentDifference < minDifference) {
                minDifference = currentDifference;
            }
        }
        
        System.out.println(minDifference);
        
        sc.close();
    }
}