import java.util.*;
import java.io.*;

public class Main {
    
    static int n;
    
    public static void main(String args[]) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        
        if(n == 1) {
            System.out.println(2);
            System.exit(0);
        }
        for(int i = n; ; i++){
            if(isPalindrom(i) && isPrime(i)) {
                System.out.println(i);
                System.exit(0);
            }
        }
    }
    
    public static boolean isPalindrom(int num) {
        String strNum = Integer.toString(num);
        int cnt = strNum.length();
        
        for(int i = 0; i <= cnt / 2; i++) {
            if(strNum.charAt(i) != strNum.charAt(cnt-i-1)) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isPrime(int num) {
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}