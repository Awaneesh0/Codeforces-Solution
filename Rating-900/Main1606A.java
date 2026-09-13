import java.util.*;

public class Main1606A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            String s = sc.next();
            char[] arr = s.toCharArray();
            int n = arr.length;
            
            // If the string starts and ends with different letters, it is imbalanced.
            // Overwriting the first letter to match the last letter instantly balances it.
            if (arr[0] != arr[n - 1]) {
                arr[0] = arr[n - 1];
            }
            
            System.out.println(new String(arr));
        }
        
        sc.close();
    }
}