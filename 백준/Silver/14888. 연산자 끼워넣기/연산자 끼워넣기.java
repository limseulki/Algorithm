import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	static int N;
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
	static ArrayList<Integer> num = new ArrayList<>();
	static ArrayList<Integer> opr = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		N = Integer.parseInt(br.readLine());
        
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		
		for(int i = 0 ; st1.hasMoreTokens();i++) {
			num.add(Integer.parseInt(st1.nextToken()));
		}
		
		for(int i = 0 ; st2.hasMoreTokens();i++) {
			opr.add(Integer.parseInt(st2.nextToken()));
		}

		dfs(num.get(0), 1);
		
		System.out.println(max);
		System.out.println(min);
    }
    
	public static void dfs(int a, int depth) {
		
		if(depth == N) {
			max = Math.max(max, a);
			min = Math.min(min, a);
            
			return;
		}
		
		for(int i = 0 ; i < 4 ; i++) {
			if(opr.get(i)>0) {
				opr.set(i, opr.get(i)-1);
				
				switch(i) {
					case 0:
                        dfs(a+num.get(depth), depth+1);	
                        break;
					case 1:
                        dfs(a-num.get(depth), depth+1);	
                        break;
					case 2:
                        dfs(a*num.get(depth), depth+1);	
                        break;
					case 3:
                        dfs(a/num.get(depth), depth+1);	
                        break;
				}
                
				opr.set(i, opr.get(i)+1);
			}
		}	
	}
}