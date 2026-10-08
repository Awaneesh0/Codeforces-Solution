import java.util.*;

public class Main1714A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int H = sc.nextInt();
            int M = sc.nextInt();
            
            // Flatten bedtime into absolute minutes
            int bedTime = H * 60 + M;
            
            // Max possible sleep time is exactly 24 hours (1440 minutes)
            int minSleep = 24 * 60;
            
            // Process the stream of alarms dynamically
            for (int i = 0; i < n; i++) {
                int h = sc.nextInt();
                int m = sc.nextInt();
                
                int alarmTime = h * 60 + m;
                int diff = alarmTime - bedTime;
                
                // If the difference is negative, the alarm is on the next day.
                // We add a full 24 hours in minutes to wrap around midnight.
                if (diff < 0) {
                    diff += 24 * 60;
                }
                
                // Keep track of the absolute closest alarm
                minSleep = Math.min(minSleep, diff);
            }
            
            // Convert the flattened answer back to H M format
            System.out.println((minSleep / 60) + " " + (minSleep % 60));
        }
        
        sc.close();
    }
}