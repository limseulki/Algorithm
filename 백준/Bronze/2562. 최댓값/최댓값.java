import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int max = 0;
        int count = 0;
        int[] num = new int[9];
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < 9; i++) {
            num[i] = sc.nextInt();
        }
        
        for(int i = 0; i < num.length; i++) {
            if(max < num[i]) {
                max = num[i];
                count = i+1;
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
}