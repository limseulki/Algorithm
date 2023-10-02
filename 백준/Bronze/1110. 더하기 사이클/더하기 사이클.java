import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int num = N;
        int cnt = 0;
        int a, b, c, d;
        int sum = 0;

        while(true) {
            a = num / 10;
            b = num % 10;

            sum = a + b;

            c = sum / 10;
            d = sum % 10;

            num = b * 10 + d;

            cnt++;

            if(N == num) {
                break;
            }
        }

        System.out.println(cnt);

        br.close();
    }
}