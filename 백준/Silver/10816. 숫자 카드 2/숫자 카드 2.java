import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        HashMap<Integer, Integer> cards = new HashMap<Integer, Integer>();
        
		int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
		StringBuilder sb = new StringBuilder();
		        
		for(int i = 0; i < N; i++) {
			int card = Integer.parseInt(st.nextToken());
            
			if(cards.get(card) == null) {
                cards.put(card, 1);
            } else {
                cards.put(card, cards.get(card) + 1);
            }
		}		
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
        
		for(int i = 0; i < M; i++) {
			int num = Integer.parseInt(st.nextToken());
            
			if(cards.get(num) == null) {
                sb.append(0).append(" ");
            } else {
                sb.append(cards.get(num)).append(" ");
            }
		}
        
		System.out.println(sb);
	}
}