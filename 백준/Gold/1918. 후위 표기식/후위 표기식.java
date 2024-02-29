import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
        
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	    StringBuilder sb = new StringBuilder();
        
	    Stack<Character> stack = new Stack<>();
	    
        String input = br.readLine();
        
	    for(int i = 0; i < input.length(); i++) {
	    	char tmp = input.charAt(i);
            
	    	if('A' <= tmp && tmp <= 'Z') {
	    		sb.append(tmp);
	    	} else if(tmp == '(') {
	    		stack.add('(');
	    	} else if(tmp == ')') {
	    		while(!stack.isEmpty()) {
	    			if(stack.peek() == '(') {
	    				stack.pop();
	    				break;
	    			}
	    			sb.append(stack.pop());
	    		}
	    	} else {
	    		while(!stack.isEmpty() && priority(stack.peek()) >= priority(tmp)) {
	    			sb.append(stack.pop());
	    		}
	    		stack.add(tmp);
	    	}
	    }
        
	    while(!stack.isEmpty()) {
	    	sb.append(stack.pop());
	    }
        
	    bw.write(sb.toString());
	    bw.flush();
	    bw.close();
	    br.close();
	}

    static int priority(char tmp) {
		if(tmp == '(') return 0;
		else if(tmp == '+' || tmp == '-') return 1;
		else return 2;
	}
}