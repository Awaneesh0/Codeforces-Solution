import java.util.*;

public class Main580A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int maxStreak = 1;
        int currentStreak = 1;
        int previousDay = sc.nextInt();
        
        for (int i = 1; i < n; i++) {
            int currentDay = sc.nextInt();
            
            if (currentDay >= previousDay) {
                currentStreak++;
                
                if (currentStreak > maxStreak) {
                    maxStreak = currentStreak;
                }
                
            } else {
                currentStreak = 1; 
            }
            
            previousDay = currentDay;
        }
        
        System.out.println(maxStreak);
        
        sc.close();
    }
}