import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
	public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] x = new int[M];
        int answer = 0;

        for(int i = 0; i < M; i++) {
        	int point = Integer.parseInt(st.nextToken());
        	x[i] = point;
        }
        
        int low = 1;
        int high = N;
        
        while(low <= high) {
        	int mid = (low + high) / 2;
        	boolean flag = true;
        	int point = 0;
            
        	for(int i = 0; i < x.length; i++) {
        		if(x[i] - mid <= point) {
        			point = x[i] + mid;
        		} else {
        			flag = false;
        		}
        	}
            
        	if(N - point > 0) {
                flag = false;
            } else {
                flag = true;
            }
            
        	if(flag) {
        		answer = mid;
        		high = mid - 1;
        	} else {
        		low = mid + 1;
        	}
        }
        
        System.out.println(answer);
	}
}