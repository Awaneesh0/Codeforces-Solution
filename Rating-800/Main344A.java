import java.util.*;

public class Main344A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String prev = sc.next();
        int group = 1;
        for(int i=1;i<n;i++){
            String curr = sc.next();
            if(!curr.equals(prev)){
                group++;
            }
            prev = curr;
        }
        System.out.println(group);
        sc.close();
    }
}