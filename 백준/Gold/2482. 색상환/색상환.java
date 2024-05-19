import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    static int MOD = 1000000003;
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        
        if(N / 2 < K) {
            System.out.println(0);
            return;
        }
        
        int[][] dp = new int[N + 1][K + 1];
        
        dp(dp, N, K);
        
        System.out.println((dp[N - 3][K - 1] + dp[N - 1][K]) % MOD);
    }
    
    static void dp(int[][] dp, int N, int K) {
        for(int i = 1; i < N + 1; i++) {
            dp[i][0] = 1;
            dp[i][1] = i;
        }
        
        for(int i = 3; i < N + 1; i++) {
            for(int j = 2; j <= (i + 1) / 2 && j < K + 1; j++) {
                dp[i][j] = (dp[i - 1][j] + dp[i - 2][j - 1]) % MOD;
            }
        }
    }
}