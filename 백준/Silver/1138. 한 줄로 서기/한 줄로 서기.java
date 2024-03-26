import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
	public static void main(String[] args) throws Exception {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] line = new int[N + 1];
        
		for(int i = 1 ; i <= N ; i++) {
			int count = Integer.parseInt(st.nextToken());
            
			for(int j = 1; j <= N ;j ++) {
				if(count == 0) {
					if(line[j] == 0) {
						line[j] = i;
						break;
					} else {
						continue;
					}
				} else if(line[j] == 0) {
					count--;
				}
			
			}
		}
        
		for(int i = 1 ; i <= N ; i++) {
            System.out.print(line[i] + " ");
        }
	}
}