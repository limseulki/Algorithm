import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < T; i++) {
            boolean check = true;
            String brackets = br.readLine();

            for(int j = 0; j < brackets.length(); j++) {
                if(brackets.charAt(j) == '(') {
                    stack.push(1);
                }
                if(brackets.charAt(j) == ')') {
                    if(stack.size() == 0) {
                        check = false;
                    } else {
                        stack.pop();
                    }
                }
            }
            if(stack.size() != 0) {
                check = false;
            }
            if(check) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            stack.clear();
        }

        br.close();
    }
}