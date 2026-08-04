import java.util.*;

public class Main208A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        String song = sc.next();

        String original = song.replaceAll("(WUB)+", " ").trim();
        
        System.out.println(original);
        
        sc.close();
    }
}