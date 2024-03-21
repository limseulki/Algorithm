import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
	static int switchCnt, studentCnt, gender, n;
	static int[] arr;

	public static void main(String[] args) throws Exception {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		switchCnt = Integer.parseInt(br.readLine());

		arr = new int[switchCnt + 1];
        
		StringTokenizer st = new StringTokenizer(br.readLine());
        
		for(int i = 1; i <= switchCnt; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		studentCnt = Integer.parseInt(br.readLine());
        
		for(int i = 1; i <= studentCnt; i++) {
			st = new StringTokenizer(br.readLine());
            
			gender = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());

			if(gender == 1) {
				male();
			} else {
				female();
			}
		}
        
		for(int i = 1; i <= switchCnt; i++) {
			System.out.print(arr[i] + " ");
			if(i % 20 == 0) {
				System.out.println();
			}
		}
	}

	static void male() {
		for(int j = n; j <= switchCnt; j += n) {
			if(j % n == 0) {
				arr[j] = (arr[j] == 1) ? 0 : 1;
			}
		}
	}

	static void female() {
		arr[n] = arr[n] == 0 ? 1 : 0;
        
		int count = 1;
        
		while(n - count >= 1 && n + count <= switchCnt) {
			if(arr[n - count] == arr[n + count]) {
				arr[n - count] = arr[n - count] == 0 ? 1 : 0;
				arr[n + count] = arr[n + count] == 0 ? 1 : 0;
			} else {
				break;
			}
			count++;
		}
	}
}