import java.util.Scanner;
import java.lang.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        String[] str = new String[T];
        
        for(int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        sc.close();
        
        for(int i = 0; i < str.length; i++) {
            System.out.print(str[i].substring(0,1));
            System.out.println(str[i].substring(str[i].length()-1,str[i].length()));
        }
    }
}