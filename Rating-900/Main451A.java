import java.util.*;

public class Main451A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int maxMoves = Math.min(n, m);
        
        if (maxMoves % 2 != 0) {
            System.out.println("Akshat");
        } 
        else {
            System.out.println("Malvika");
        }
        
        sc.close();
    }
}