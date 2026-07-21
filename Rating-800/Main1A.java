import java.util.*;
public class Main1A{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();
        long na = n/a;
        if(n%a!=0){
            na = na+1;
        }
        long ma = m/a;
        if(m%a!=0){
            ma = ma+1;
        }
        long res = na * ma;
        System.out.println(res);
        sc.close();  
    }
}