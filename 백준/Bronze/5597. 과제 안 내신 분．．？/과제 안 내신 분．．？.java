import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[31];
        
        for(int i = 1; i < 29; i++) {
            int a = sc.nextInt();
            n[a] = 1;
        }
        
        for(int i = 1; i < n.length; i++) {
            if(n[i] != 1) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}