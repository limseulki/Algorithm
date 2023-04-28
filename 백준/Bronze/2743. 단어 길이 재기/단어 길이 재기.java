import java.util.Scanner;
import java.lang.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String word = sc.next();
        char[] charWord = new char[word.length()];
        
        for(int i = 0; i < word.length(); i++) {
            charWord[i] = word.charAt(i);
        }
        System.out.print(charWord.length);
    }
}