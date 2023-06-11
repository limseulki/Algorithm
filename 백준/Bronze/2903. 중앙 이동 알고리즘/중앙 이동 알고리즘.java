import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int num = 2;
        int answer = 0;

        br.close();

        for(int i = 0; i < N; i++) {
            num += (int)(Math.pow(2,i));
        }
        answer = (int)(Math.pow(num, 2));
        System.out.println(answer);
    }
}