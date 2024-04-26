import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
        
		StringTokenizer st = new StringTokenizer(br.readLine());
        
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
        
		Arrays.sort(arr);
        
		int answer = 0;
        
		for(int i = 0; i < N; i++) {
			int left = 0;
			int right = N - 1;
            
			while(true) {
				
				if(i == left) {
                    left++;
                } else if(right == i) {
                    right--;
                }
				if(left >= right) {
                    break;
                }
				if(arr[left] + arr[right] > arr[i]) {
                    right--;
                } else if(arr[left] + arr[right] < arr[i]) {
                    left++;
                } else {
					answer++;
					break;
				}
			}
		}
		System.out.println(answer);
	}
}