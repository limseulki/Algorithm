import java.util.Scanner;
import java.util.HashSet;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // HashSet : 중복 X, 순서 X
        HashSet<Integer> a = new HashSet<Integer>();
        
        for(int i = 0; i < 10; i++) {
            a.add(sc.nextInt() % 42);
        }
        
        sc.close();
        System.out.print(a.size());
    }
}