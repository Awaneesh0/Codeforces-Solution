import java.util.*;

public class Main71A {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String empty = sc.nextline();
        for (int i = 0; i<n ; i++){
            String word = sc.nextline();
            int len = word.length();
            if (len>10){
                System.out.print(word.charAt(0));
                System.out.print(len-2);
                System.out.println(word.charAt(len-1));
            }else{
                System.out.println(word);
            }
        }
    }
}