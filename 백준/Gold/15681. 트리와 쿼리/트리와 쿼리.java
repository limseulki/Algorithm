import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	static int[] numOfChild;
	static List<Integer>[] list;
    
	public static void main(String[] args) throws IOException{
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());
		
		list = new ArrayList[n + 1];
        
		for(int i = 1; i < n + 1; i++) {
			list[i] = new ArrayList<>();
		}
        
		numOfChild = new int[n + 1];
		Arrays.fill(numOfChild, 1);
        
		for(int i = 0; i < n - 1; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			list[u].add(v);
			list[v].add(u);
		}
		
		traversal(r, -1);
		
		for(int i = 0; i < q; i++) {
			int index = Integer.parseInt(br.readLine());
            
			System.out.println(numOfChild[index]);
		}
	}
	
	static void traversal(int index, int pa) {
		for(int next : list[index]) {
			if(pa != next) {
				traversal(next, index);
			}
		}
		
		if(pa != -1) {
			numOfChild[pa] += numOfChild[index];
		}
	}
}