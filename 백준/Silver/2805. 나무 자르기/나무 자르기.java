import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
        
		st = new StringTokenizer(br.readLine());
        
		int land = 0;
		int H = -1;
        
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
            
			H = Math.max(H, arr[i]);
		}
		
		while(land <= H) {
			int mid = (land + H) / 2;
			long tree = 0;
            
			for(int i = 0; i < N; i++) {
				if(arr[i] > mid) {
                    tree += arr[i] - mid;
                }
			}
			if(tree >= M) {
				land = mid + 1;
			}else if(tree < M) { 
				H = mid - 1;
			}
		}
		
		System.out.println(H);
	}
}