import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        int[][] item = new int[N + 1][2];
        int[][] dp = new int[N + 1][K + 1];

        for(int i = 1; i <= N; i++) {
            input = br.readLine().split(" ");
            
            item[i][0] = Integer.parseInt(input[0]);
            item[i][1] = Integer.parseInt(input[1]);
        }

        for(int k = 1; k <= K; k++) {
            for(int i = 1; i <= N; i++) {
                dp[i][k] = dp[i - 1][k];
                
                if(k - item[i][0] >= 0) {
                    dp[i][k] = Math.max(dp[i - 1][k], item[i][1] + dp[i - 1][k - item[i][0]]);
                }
            }
        }
        
        System.out.println(dp[N][K]);
    }
}