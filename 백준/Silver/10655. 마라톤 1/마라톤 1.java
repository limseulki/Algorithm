import java.io.*;
import java.util.*;

public class Main {
    
	public static void main(String[] args) throws IOException{
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        
		int N = Integer.parseInt(br.readLine());
        
		int[][] arr = new int[N][2];
        
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
            
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
        
		int distance[] = new int[N - 1];
		int sum = 0;
        
		for(int i = 0; i < N - 1; i++) {
			distance[i] = manhattan(arr[i], arr[i + 1]);
			sum += distance[i];
		}
        
		int max = 0;
        
		for(int i = 0; i < N - 2; i++) {
			int skip = manhattan(arr[i], arr[i + 2]);
            
			max = Math.max(max, distance[i] + distance[i + 1] - skip);
		}
        
		System.out.println(sum - max);
	}
    
	static int manhattan(int[] s, int[] e) {
		return Math.abs(s[0] - e[0]) + Math.abs(s[1] - e[1]);
	}
}