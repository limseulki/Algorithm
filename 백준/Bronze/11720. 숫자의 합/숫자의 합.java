import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        String strNum = sc.next();
        sc.close();
        
        char[] charNum = new char[N];
        int sum = 0;
        
        for(int i = 0; i < N; i++) {
            charNum[i] = strNum.charAt(i);
            sum += charNum[i]-'0';
        }
        System.out.print(sum);
    }
}