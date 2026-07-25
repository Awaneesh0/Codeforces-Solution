import java.util.*;

public class Main136A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] giftGivers = new int[n + 1];
        
        for (int i = 1; i <= n; i++) {
            int receiver = sc.nextInt();
            giftGivers[receiver] = i;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(giftGivers[i]).append(" ");
        }

        System.out.println(sb.toString().trim());
        
        sc.close();
    }
}