import java.util.*;

public class Main467A{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (b-a>=2){
                count++;
            }            
        }

        System.out.println(count);
        
        sc.close();
    }
}