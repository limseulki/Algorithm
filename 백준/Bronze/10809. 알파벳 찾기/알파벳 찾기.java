import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        
        String s = sc.next();
        sc.close();
        
        for(int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            int temp = (int)a;
            temp -= 97;
            
            if(arr[temp] == -1){
                arr[temp] = i;
            }
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}