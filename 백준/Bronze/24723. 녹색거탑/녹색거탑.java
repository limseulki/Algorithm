import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int answer = (int)Math.pow(2, N);
        
        System.out.print(answer);
    }
}