import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	    public static void main(String[] args) throws IOException {
            
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
            
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
            
        st = new StringTokenizer(br.readLine()," ");

        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
            
        int num = (A * D) + (B * C);
        int den = B * D;
        
        int gcd = GCD(num, den);
            
        num /= gcd;
        den /= gcd;
        
        System.out.println(num + " " + den);
	}
    
    public static int GCD(int a, int b) {
		if (a % b == 0) {
			return b;
		}
		return GCD(b, a % b);
	}
}