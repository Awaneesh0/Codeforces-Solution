import java.util.*;
public class Main263A{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int row = 0;
        int col = 0;
        int result = 0;
        
        for (int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                int a = sc.nextInt();
                if(a==1){
                    row = i;
                    col = j;
                    result = Math.abs(row-3) + Math.abs(col-3);
                    break;
                }
            }
        }
        
        System.out.println(result);
        sc.close();
    }
}