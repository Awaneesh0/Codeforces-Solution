import java.util.*;
public class Main339A{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        String[] s = n.split("\\+");
        Arrays.sort(s);

        for(int i=0 ; i<s.length ; i++){
            System.out.print(s[i]);

            if(i<s.length-1){
                System.out.print("+");
            }
        }
        sc.close();  
    }
}