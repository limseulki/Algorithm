import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int p = 1;
        
        for(int i = 0; i < N; i ++) {
            p *= (N - i);
        }
        System.out.print(p);
    }
}