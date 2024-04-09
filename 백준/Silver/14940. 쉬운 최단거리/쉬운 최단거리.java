import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    
	static int arr[][], result[][], n, m;
	static int dx[] = {-1, 1, 0, 0};
	static int dy[] = {0, 0, -1, 1};
	static boolean visited[][];
    
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		arr = new int[n][m];
		result = new int[n][m];
		visited = new boolean[n][m];
		int x = 0, y = 0;
        
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
            
			for(int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
                
				if(arr[i][j] == 2) {
					x = i;
					y = j;
				} else if(arr[i][j] == 0) {
                    visited[i][j] = true;
                }
			}
		}
        
		search(x, y);

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(!visited[i][j]) {
					result[i][j] =- 1;
				}	
				System.out.print(result[i][j] + " ");	
			}
			System.out.println();
		}
	}
    
	private static void search(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {x,y});
		visited[x][y] = true;

		while(!queue.isEmpty()) {
			int temp[] = queue.poll();
            
			for(int i = 0; i < 4; i++) {
				int a = temp[0] + dx[i];
				int b = temp[1] + dy[i];
                
				if(a >= 0 && a < n && b >= 0 && b < m) {
					if(!visited[a][b] && arr[a][b] == 1) {
						visited[a][b] = true;
						result[a][b] = result[temp[0]][temp[1]] + 1;
						queue.add(new int[] {a,b});
					}
				}
			}
		}
	}
}