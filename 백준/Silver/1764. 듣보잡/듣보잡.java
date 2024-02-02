import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

        HashSet<String> set = new HashSet<>();
		ArrayList<String> arrList = new ArrayList<String>();

		for(int i = 0; i < N; i++) {
			set.add(br.readLine());
		}

		for(int i = 0; i < M; i++) {
			String str = br.readLine();
            
			if(set.contains(str)) {
				arrList.add(str);
			}
		}

		Collections.sort(arrList);

		System.out.println(arrList.size());

		for(int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
	}
}