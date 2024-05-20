import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
	static int n, INF = Integer.MAX_VALUE;
	static int[] data;
	static int[][] dp;
    
	public static void main(String[] args) throws IOException{
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		data = new int[n+1];
        
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			data[i] = a; data[i+1] = b;
		}
		
		dp = new int[n][n];
		
		for(int i=2; i<n+1; i++) {
			for(int j=0; j<n-i+1; j++) {
				dp[j][j+i-1] = INF;
				for(int k=j; k<j+i-1; k++) {
					int value = dp[j][k]  + dp[k+1][j+i-1] + (data[j]*data[k+1]*data[j+i]);
					dp[j][j+i-1] = Math.min(dp[j][j+i-1], value);
				}
			}
		}
		System.out.println(dp[0][n-1]);
	}
}