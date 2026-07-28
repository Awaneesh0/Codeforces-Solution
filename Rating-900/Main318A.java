import java.util.*;
public class Main318A{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long odds = (n + 1) / 2;
        if(k<=odds){
            System.out.println(2*k-1);
        }else{
            long evenpos = k - odds;
            System.out.println(2*evenpos);    
        }
    }
}