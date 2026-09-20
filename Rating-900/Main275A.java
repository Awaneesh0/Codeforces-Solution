import java.util.*;

public class Main275A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        
        // We pad the 3x3 grid into a 5x5 array (indices 0 through 4)
        // This acts as a safe border of 0s around our actual data
        int[][] presses = new int[5][5];
        
        // Read the 3x3 input into the center of our padded array
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                presses[i][j] = sc.nextInt();
            }
        }
        
        // Calculate the final state for the actual 3x3 grid
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                
                // Sum the presses of the cell and its 4 neighbors
                int totalToggles = presses[i][j] 
                                 + presses[i - 1][j] 
                                 + presses[i + 1][j] 
                                 + presses[i][j - 1] 
                                 + presses[i][j + 1];
                
                // If toggled an even amount of times, it stays ON (1)
                if (totalToggles % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println(); // Next row
        }
        
        sc.close();
    }
}