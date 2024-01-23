import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		Queue<Integer> waitQ = new LinkedList<>();
		Stack<Integer> addS = new Stack<>();

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			waitQ.offer(Integer.parseInt(st.nextToken()));
		}
		
		int start = 1;
		
		while(!waitQ.isEmpty()) {
			if(waitQ.peek() == start) {
				waitQ.poll();
				start++;
			} else if(!addS.isEmpty() && addS.peek() == start) {
				addS.pop();
				start++;
			} else {
				addS.push(waitQ.poll());
			}
		}
		
		while(!addS.isEmpty()) {
			if(addS.peek() == start) {
				addS.pop();
				start++;
			} else {
				System.out.println("Sad");
				return;
			}
		}

		System.out.println("Nice");
	}
}