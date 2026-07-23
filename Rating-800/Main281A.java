import java.util.*;

public class Main281A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        
        String firstLetter = word.substring(0, 1).toUpperCase();
        
        String restOfWord = word.substring(1);
        
        System.out.println(firstLetter + restOfWord);
        
        sc.close();
    }
}