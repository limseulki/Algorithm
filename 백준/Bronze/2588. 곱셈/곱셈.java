import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int firNum = sc.nextInt();
        int secNum = sc.nextInt();
        
        int last = secNum%10;
        int mid = secNum/10%10;
        int first = secNum/100;
        
        int firAns = firNum*last;
        int secAns = firNum*mid;
        int thirAns = firNum*first;
        
        int answer = firAns+secAns*10+thirAns*100;
        
        System.out.println(firAns);
        System.out.println(secAns);
        System.out.println(thirAns);
        System.out.println(answer);
    }
}