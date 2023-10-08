import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            String method = st.nextToken();

            if(method.equals("push")) {
                int value = Integer.parseInt(st.nextToken());
                stack.push(value);
            }
            if(method.equals("pop")) {
                if(stack.size() == 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.pop());
                }
            }
            if(method.equals("size")) {
                System.out.println(stack.size());
            }
            if(method.equals("empty")) {
                if(stack.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }
            if(method.equals("top")) {
                if(stack.size() == 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.get(stack.size()-1));
                }
            }
        }

        br.close();
    }
}