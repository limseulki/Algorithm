import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int F = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            F += Integer.parseInt(st.nextToken());
        }

        if(T <= F) {
            System.out.println("Padaeng_i Happy");
        } else {
            System.out.println("Padaeng_i Cry");
        }
    }
}