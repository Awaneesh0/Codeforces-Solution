import java.util.*;

public class Main114A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int max = 0;
        int min = 101;
        int maxi = 0;
        int mini = 0;
        for(int i = 0; i < n; i++ ){
            int a = sc.nextInt();
            if (max<a){
                max = a;
                maxi = i;
            }
            if(min>=a){
                min = a;
                mini = i;
            }
        }

        int total = maxi + ((n-1)-mini);
        if (maxi>mini){
            total = total - 1;
        }
        System.out.println(total);
        sc.close();
    }
}