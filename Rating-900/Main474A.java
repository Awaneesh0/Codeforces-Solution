import java.util.*;

public class Main474A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        char dir = sc.next().charAt(0);
        
        String typedText = sc.next();
        
        String keyboard = "qwertyuiopasdfghjkl;zxcvbnm,./";
        
        StringBuilder originalMessage = new StringBuilder();
        
        for (int i = 0; i < typedText.length(); i++) {
            char currentChar = typedText.charAt(i);
            
            int index = keyboard.indexOf(currentChar);
            
            if (dir == 'R') {
                originalMessage.append(keyboard.charAt(index - 1));
            } else {
                originalMessage.append(keyboard.charAt(index + 1));
            }
        }
        
        System.out.println(originalMessage.toString());
        
        sc.close();
    }
}