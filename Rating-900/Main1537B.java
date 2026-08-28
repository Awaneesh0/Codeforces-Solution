import java.util.*;

public class Main1537B{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long n = sc.nextLong();
            long m = sc.nextLong();
            long i = sc.nextLong(); // We read it, but we don't need it!
            long j = sc.nextLong(); // We read it, but we don't need it!
            
            // Always throw the yo-yos in the top-left and bottom-right corners
            System.out.println("1 1 " + n + " " + m);
        }
        
        sc.close();
    }
}