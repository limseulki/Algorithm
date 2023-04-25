import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long N = sc.nextLong();
        long M = sc.nextLong();
        
        System.out.print(Math.abs(N-M));
    }
}