import java.io.*;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    
	public static void main(String[] args) throws IOException{
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        
		int N = Integer.parseInt(br.readLine());
		
		Queue<Integer> max = new PriorityQueue<>((o1,o2) -> o2-o1);  
		Queue<Integer> min = new PriorityQueue<>((o1,o2) -> o1-o2);
		
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
            
			if(max.size() == min.size()) {
                max.add(num);
            } else {
                min.add(num);
            }
            
			if(!max.isEmpty() && !min.isEmpty()) {
				if(max.peek() > min.peek()) {
					int tmp = max.poll();
					max.offer(min.poll());
					min.offer(tmp);
				}
			}
			sb.append(max.peek() + "\n");
		}
		System.out.println(sb.toString());
	}
}