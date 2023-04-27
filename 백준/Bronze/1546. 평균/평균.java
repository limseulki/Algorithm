import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        double[] a = new double[N];
        double max = 0;
        double sum = 0;
        double avg = 0;
        
        for(int i = 0; i < a.length; i++) {
            a[i] = sc.nextDouble();
        }
        
        sc.close();
        
        for(int i = 0; i < N; i++) {
            if(a[i] > max) {
                max = a[i];
            }
        }
        
        for(int i = 0; i < N; i++) {
            sum += a[i]/max*100;
        }
        
        avg = sum/N;
        System.out.print(avg);
    }
}