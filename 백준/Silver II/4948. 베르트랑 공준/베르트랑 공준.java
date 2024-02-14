import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			int num = 0;
            
			boolean[] arr = new boolean[(2 * n) + 1];
			
			if(n == 0) {
                break;
            }
			
			arr[0] = true;
            arr[1] = true;
			
			for(int i = 2; i * i <= 2 * n; i++) {
				if(!arr[i]) {
					for(int j = i * i; j <= 2 * n; j += i) {
						arr[j] = true;
					}
				}
			}
			
			for(int i = n + 1; i <= 2 * n; i++) {
				if(!arr[i]) {
                    num++;
                }
			}
            
			System.out.println(num);
		}
	}
}