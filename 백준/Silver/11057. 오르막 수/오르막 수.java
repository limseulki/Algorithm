import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] dp = new int[N+1][10];

        // N = 1일 때
        for(int i = 0; i < 10; i++) {
            dp[1][i] = 1;
        }

        // N = 2이상일 때
        for(int i = 2; i <= N; i++) {
            for(int j = 0; j < 10; j++) {
                if(j == 0) {
                    dp[i][j] = dp[i-1][j] % 10007;
                } else {
                    dp[i][j] = dp[i][j-1] + dp[i-1][j];
                    dp[i][j] %= 10007;
                }
            }
        }

        int answer = 0;
        for(int i = 0; i < 10; i++) {
            answer += dp[N][i];
        }
        answer %= 10007;

        System.out.println(answer);

        br.close();
    }
}