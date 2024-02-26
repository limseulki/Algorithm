import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
 
	public static int[] arr;
	public static boolean[] flag;
	public static StringBuilder sb = new StringBuilder();
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
 
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
 
		arr = new int[M];
		flag = new boolean[N];
        
		dfs(N, M, 0);
        
		System.out.println(sb);
	}
 
	public static void dfs(int N, int M, int cnt) {
		if(cnt == M) {
			for(int num : arr) {
				sb.append(num).append(' ');
			}
            
			sb.append('\n');
            
			return;
		}
 
		for(int i = 0; i < N; i++) {
			if(!flag[i]) {
				flag[i] = true;
                
				arr[cnt] = i + 1;
				dfs(N, M, cnt + 1);
                
				flag[i] = false;
			}
		}
	}
}