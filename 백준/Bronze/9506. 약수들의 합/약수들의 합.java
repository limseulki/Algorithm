import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true) {
            StringBuilder sb = new StringBuilder();
            int n = Integer.parseInt(br.readLine());

            int sum = 0;
            
            if(n == -1) {
                break;
            }
            
            for(int i = 1; i < n; i++)
                if(n % i == 0) {
                    sb.append(i + " + ");
                    sum += i;
                }
            System.out.println(n == sum ? n + " = " + sb.toString().substring(0, sb.length()-3) : n + " is NOT perfect.");
        }
    }
}