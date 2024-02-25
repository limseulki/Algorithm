import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int num1 = 1;
	static int num2 = 0;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
        
		fib(N);
		fibonacci(N);
        
		System.out.println(num1 + " " + num2);
	}
	
	public static int fib(int n) {	
		if(n <= 2) {
            return 1;
        }
        
		num1++;

		return fib(n - 1) + fib(n - 2);
	}
	
	public static int fibonacci(int n) {
		int[] fibo = new int[n+1];

		fibo[1] = 1;
		fibo[2] = 1;
        
		for(int i = 3; i <= n; i++) {
			num2++;
			fibo[i] = fibo[i - 1] + fibo[i - 2];
		}
        
		return fibo[n];
	}
}