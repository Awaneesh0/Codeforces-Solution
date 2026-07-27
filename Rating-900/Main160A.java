import java.util.*;

public class Main160A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] coinmap = new int[101];
        int total = 0;
        int mysum = 0;
        int cointaken = 0;

        for (int i = 1; i<=s ; i++){
            int n = sc.nextInt();
            coinmap[n]++;
            total = total+n;
        }
        for (int j=100 ; j > 0; j--){
            while(coinmap[j]>0){
                mysum = mysum+j;
                total = total-j;
                coinmap[j]--;
                cointaken++;
                if (mysum>total){
                    System.out.println(cointaken);
                    return;
                }
            }
        }
        sc.close();
    }
}