import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] bucket = new int[N];
        int temp;
        
        for(int i = 0; i < N; i++) {
            bucket[i] = i+1;
        }
        
        for(int j = 0; j < M; j++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            while(a < b) {
                temp = bucket[a-1];
                bucket[a-1] = bucket[b-1];
                bucket[b-1] = temp;
                a++;
                b--;
            }
        }
        
        for(int k = 0; k < bucket.length; k++) {
            System.out.print(bucket[k] + " ");
        }
    }
}