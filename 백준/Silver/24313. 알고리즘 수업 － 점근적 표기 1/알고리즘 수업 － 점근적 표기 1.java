import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a0 = scanner.nextInt();
        int c = scanner.nextInt();
        int n0 = scanner.nextInt();

        int f = a1 * n0 + a0;
        int b = c * n0;

        if(f <= b && a1 <= c) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}