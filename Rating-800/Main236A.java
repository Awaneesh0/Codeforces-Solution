import java.util.*;

public class Main236A{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); 
        HashSet<Character> uniqueCharacters = new HashSet<>();

        for(int i=0;i<s.length();i++){
            uniqueCharacters.add(s.charAt(i));
        }
        if (uniqueCharacters.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
        sc.close();
    }
}