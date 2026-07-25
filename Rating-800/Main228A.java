import java.util.*;

public class Main228A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> uni = new HashSet<>();

        for( int i = 0; i < 4; i++){
            int n = sc.nextInt();
            uni.add(n);
        }
        
        System.out.println(4 - uni.size());
        sc.close();
    }
}