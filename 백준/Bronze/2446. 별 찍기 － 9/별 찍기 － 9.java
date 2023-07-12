import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= i-1; j++) {
                sb.append(" ");
            }
            for(int k = 2*(N-i+1)-1; k > 0; k--) {
                sb.append("*");
            }
            sb.append("\n");
        }
        for(int i = 1; i <= N-1; i++) {
            for(int j = N-i-1; j > 0; j--) {
                sb.append(" ");
            }
            for(int k = 1; k <= 2*(i+1)-1; k++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}