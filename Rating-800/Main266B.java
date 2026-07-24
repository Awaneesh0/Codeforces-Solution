import java.util.*;

public class Main266B {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int t = sc.nextInt();
        char[] q = sc.next().toCharArray();

        for(int time = 0;time<t;time++){
            for(int i =0;i<n-1;i++){
                if(q[i]=='B'&&q[i+1]=='G'){
                    q[i+1]='B';
                    q[i]='G';
                    i++;
                }
            }
        }
        System.out.println(new String(q));
        sc.close();
    }
}
