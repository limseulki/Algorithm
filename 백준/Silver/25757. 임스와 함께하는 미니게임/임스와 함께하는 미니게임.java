import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        
		int n = Integer.parseInt(st.nextToken());
		String game = st.nextToken();
		int player = 0;
        
		if(game.equals("Y")) {
            player = 1;
        } else if(game.equals("F")) {
            player = 2;
        } else if(game.equals("O")) {
            player = 3;
        }
		
		int count = 0;
		int players = player;
		Set<String> set = new HashSet<>();
        
		for(int i = 0; i < n; i++) {
			String name = br.readLine();
            
			if(set.contains(name)) {
                continue;
            } else {
				set.add(name);
				players--;
                
				if(players == 0) {
					count++;
					players = player;
				}
			}
		}
		System.out.println(count);
	}
}