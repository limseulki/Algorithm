import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char text = sc.next().charAt(0);
        
        int num = (int)text;
        
        System.out.print(num);
    }
}