import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = -1;
		int K = Integer.parseInt(br.readLine());
		int[] arr = new int[K];

		for(int i = 0; i < K; i++) {
			int number = Integer.parseInt(br.readLine());
			if (number == 0) {
				t--;
			} else {
				t++;
				arr[t] = number;
			}
		}
		int sum = 0;
		for(int i = 0; i <= t; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}
}