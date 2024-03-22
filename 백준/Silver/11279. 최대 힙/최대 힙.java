import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
	
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		int N = Integer.parseInt(br.readLine());

		PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			int x = Integer.parseInt(br.readLine());
            
			if(x == 0) {
				if(q.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
					sb.append(q.poll()).append("\n");
				}
			} else {
				q.offer(x);
			}
		}
		System.out.println(sb);
	}
}