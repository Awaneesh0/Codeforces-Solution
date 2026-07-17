import java.util.*;

public class Main158A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int score = 0;
        int count = 0;
        
        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt(); 
            if (a == 0){
                break;
            }
            if(i <= k){
                count++;
                if(i == k){
                    score = a;
                }
            }
            else if (score == a) {
                count++;
            }
            else{
                break;
            }
        }
        System.out.println(count);
        sc.close();
    }
}