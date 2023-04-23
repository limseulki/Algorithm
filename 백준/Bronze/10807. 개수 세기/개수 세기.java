import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N;
        int v;
        int count = 0;
        
        N = sc.nextInt();
        
        int[] a = new int[100];
        
        for(int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        v = sc.nextInt();
        
        for(int i = 0; i < N; i++) {
            if(a[i] == v) {
                count++;
            }
        }
        
        System.out.print(count);
    }
}