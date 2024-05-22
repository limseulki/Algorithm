import java.util.*;
import java.io.*;

public class Main {
    
	static int A, B, C;
	
    public static void main(String[] args) throws IOException {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
    	A = Integer.parseInt(st.nextToken());
    	B = Integer.parseInt(st.nextToken());
    	C = Integer.parseInt(st.nextToken());
    	
        boolean result = bfs(A, B, C);
        
        if(result) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
    
    static boolean bfs(int a, int b, int c) {
    	if((a + b + c) % 3 != 0) {
            return false;
        }
    	
    	Queue<Stone> que = new LinkedList<>();
        
    	boolean[][] isChecked = new boolean[1501][1501];
    	
    	que.add(new Stone(a, b, c));
    	isChecked[a][b] = true;
    	
    	while(!que.isEmpty()) {
    		Stone s = que.poll();
    		
    		a = s.a;
    		b = s.b;
    		c = s.c;
    		
    		if(a == b && b == c) {
    			return true;
    		}
    		
    		if(a != b) {
    			int na = a > b ? a-b : a+a;
    			int nb = a > b ? b+b : b-a;
    			
    			if(!isChecked[na][nb]) {
    				que.add(new Stone(na, nb, c));
    				isChecked[na][nb] = true;
    			}
    		}
    		
    		if(b != c) {
    			int nb = b > c ? b-c : b+b;
    			int nc = b > c ? c+c : c-b;
    			
    			if(!isChecked[nb][nc]) {
    				que.add(new Stone(a, nb, nc));
    				isChecked[nb][nc] = true;
    			}
    		}
    		
    		if(a != c) {
    			int na = a > c ? a-c : a+a;
    			int nc = a > c ? c+c : c-a;
    			
    			if(!isChecked[na][nc]) {
    				que.add(new Stone(na, b, nc));
    				isChecked[na][nc] = true;
    			}
    		}
    	}
    	return false;
    }
    
    static class Stone{
    	int a, b, c;
    	
    	Stone(int a, int b, int c){
    		this.a = a;
    		this.b = b;
    		this.c = c;
    	}
    }
}