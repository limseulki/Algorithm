import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] bucket = new int[N];
        
        for(int i = 0; i < M; i ++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            for(int j = a-1; j < b; j++) {
                bucket[j] = c;
            }
        }
        for(int k = 0; k < bucket.length; k++) {
            System.out.print(bucket[k] + " ");
        }
    }
}