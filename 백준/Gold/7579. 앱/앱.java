import java.util.*;
import javax.swing.plaf.metal.MetalTheme;
import java.io.*;

class Main {

	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] str = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);

		int[] memory = new int[n];
		int[] cost = new int[n];
		int[] dp = new int[10001];

		str = br.readLine().split(" ");

		for(int i = 0; i < n; i++) {
			memory[i] = Integer.parseInt(str[i]);
		}

		str = br.readLine().split(" ");

		for(int i = 0; i < n; i++) {
			cost[i] = Integer.parseInt(str[i]);
		}
		
		for(int i = 0; i <= 10000; i++) {
			dp[i] = -1;
		}
		
		for(int i = 0; i < n; i++) {
			int cur = cost[i];
			
			for(int j = 10000; j >= cur; j--) {
				if(dp[j - cur] != -1) {
					dp[j] = Math.max(dp[j], dp[j - cur] + memory[i]);
				}
			}

			dp[cur] = Math.max(dp[cur], memory[i]);
		}
		
		for(int i = 0; i <= 10000; i++) {
			if(dp[i] >= m) {
				bw.write(i + "\n");
				break;
			}
		}
        
		bw.flush();
		bw.close();
	}
}