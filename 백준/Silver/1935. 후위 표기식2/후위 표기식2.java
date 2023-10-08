import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        Stack<Double> stack = new Stack<>();

        String profix = br.readLine();

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i < profix.length(); i++) {
            char ch = profix.charAt(i);

            if(ch >= 'A' && ch <= 'Z') {
                stack.push((double)arr[ch-'A']);
            } else {
                double num2 = stack.pop();
                double num1 = stack.pop();

                switch(ch) {
                    case '+' :
                        stack.push(num1 + num2);
                        break;
                    case '-' :
                        stack.push(num1 - num2);
                        break;
                    case '*' :
                        stack.push(num1 * num2);
                        break;
                    case '/' :
                        stack.push(num1 / num2);
                        break;
                }
            }
        }

        System.out.printf("%.2f%n", stack.peek());

        br.close();
    }
}