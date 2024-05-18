import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = null;
    static StringTokenizer st = null;
    static char[][] map = null;
    static int[][][] dp = null;
    static int[] rArr = {-1, 1, 0, 0};
    static int[] cArr = {0, 0, -1, 1};
    static String target = null;
    static int n, m, k, ans;

    public static void dfs(int r, int c, int idx, int length) {
        if(idx == length - 1) {
            dp[r][c][idx] = 1;
            return;
        }
        
        if(dp[r][c][idx] != -1) {
            return;
        }
        
        dp[r][c][idx] = 0;
        
        for(int i = 1; i <= k; i++) {
            for(int j = 0; j < 4; j++) {
                int nr = r + rArr[j] * i;
                int nc = c + cArr[j] * i;
                if(-1 < nr && nr < n && -1 < nc && nc < m) {
                    if(map[nr][nc] == target.charAt(idx + 1)) {
                        dfs(nr, nc, idx + 1, length);
                        dp[r][c][idx] += dp[nr][nc][idx + 1];
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        map = new char[n][m];
        
        for(int i = 0; i < n; i++) {
            String input = br.readLine();
            for(int j = 0; j < m; j++) {
                map[i][j] = input.charAt(j);
            }
        }
        target = br.readLine();

        dp = new int[n][m][target.length()];
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(map[i][j] == target.charAt(0)) {
                    dfs(i, j, 0, target.length());
                    ans += dp[i][j][0];
                }
            }
        }
        System.out.println(ans);
    }
}