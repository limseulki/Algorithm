import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int answer = N * (N - 1);
        
        System.out.print(answer);
    }
}