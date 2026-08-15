import java.util.*;

public class Main1807D {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            
            long[] prefix = new long[n + 1];
            
            for (int i = 1; i <= n; i++) {
                long a = sc.nextLong();
                prefix[i] = prefix[i - 1] + a;
            }
            
            long totalSum = prefix[n];
            
            for (int i = 0; i < q; i++) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                long k = sc.nextLong();
                
                long oldSegmentSum = prefix[r] - prefix[l - 1];
                
                long numElements = (r - l + 1);
                long newSegmentSum = numElements * k;
                
                long newTotal = totalSum - oldSegmentSum + newSegmentSum;
                
                if (newTotal % 2 != 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        
        sc.close();
    }
}