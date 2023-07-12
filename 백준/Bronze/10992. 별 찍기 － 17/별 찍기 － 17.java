import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i < N; i++) {
            sb.append(" ");
        }
        sb.append("*");
        sb.append("\n");
        for(int i = 2; i < N; i++) {
            for(int j = N-i; j > 0; j--) {
                sb.append(" ");
            }
            sb.append("*");
            for(int j = 1; j <= 2*(i-1)-1; j++) {
                sb.append(" ");
            }
            sb.append("*");
            sb.append("\n");
        }
        if(N != 1) {
            for(int i = 1; i <= 2*N-1; i++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}