import java.util.*;

public class Main149A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int k = sc.nextInt();
        int[] months = new int[12];
        
        for (int i = 0; i < 12; i++) {
            months[i] = sc.nextInt();
        }
        
        if (k == 0) {
            System.out.println(0);
            return;
        }
        
        Arrays.sort(months);
        
        int totalGrowth = 0;
        int monthsWatered = 0;

        for (int i = 11; i >= 0; i--) {
            totalGrowth += months[i];
            monthsWatered++;
            
            if (totalGrowth >= k) {
                System.out.println(monthsWatered);
                return;
            }
        }
        
        System.out.println(-1);
        
        sc.close();
    }
}