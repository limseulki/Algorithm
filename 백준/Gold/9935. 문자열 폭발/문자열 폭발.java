import java.io.*;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException{
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
		String str = br.readLine();
		String bomb = br.readLine();
		int bombLen = bomb.length();
		
		Stack<Character> st = new Stack<>();
		
		for(int i = 0; i < str.length(); i++) {
			st.push(str.charAt(i));
			
			if(st.size() >= bombLen) {
				boolean flag = true;
                
				for(int j = 0; j < bombLen; j++) {
					if(st.get(st.size() - bombLen + j) != bomb.charAt(j)) {
						flag = false;
						break;
					}
				}
				if(flag) {
					for(int j = 0; j < bombLen; j++) {
						st.pop();
					}
				}
			}
			
		}
        
		for(Character c : st) {
			sb.append(c);
		}
        
        if(sb.length() == 0) {
            System.out.println("FRULA");
        } else {
            System.out.println(sb.toString());
        }
	}
}