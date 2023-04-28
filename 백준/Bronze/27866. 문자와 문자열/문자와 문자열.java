import java.util.Scanner;
import java.lang.Character;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String S = sc.next();
        
        int i = sc.nextInt();
        char answer = S.charAt(i-1);
        
        System.out.print(answer);
    }
}