import java.util.*;

public class Main200B {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        float total = 0;
        float orange = 0;
        for(int i=0; i<n; i++){
          int z = Integer.parseInt(sc.next());
          total+=100;
          orange+=z;  
        }

        float per = (orange/total)*100;
        System.out.println(per);
        sc.close();
    }
}