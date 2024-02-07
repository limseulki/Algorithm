import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
        
		HashMap<Integer, String> mapInt = new HashMap<Integer, String>();
		HashMap<String, Integer> mapStr = new HashMap<String, Integer>();
		
		for(int i = 1; i <= N; i++) {
			String name = br.readLine();
            
			mapInt.put(i, name);
			mapStr.put(name, i);
		}
		
		for(int i = 0; i < M; i++) {
			String name = br.readLine();
            
			if(49 <= name.charAt(0) && name.charAt(0) <= 57) {
				sb.append(mapInt.get(Integer.parseInt(name))).append("\n");
			} else {
				sb.append(mapStr.get(name)).append("\n");
			}
		}
		System.out.println(sb);
	}
}