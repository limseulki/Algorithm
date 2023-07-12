import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            for(int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for(int j = N-i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}