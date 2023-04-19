import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
 		int A = Integer.parseInt(br.readLine());
        
		if(A%4 == 0 && A%100 != 0) {
            System.out.print(1);
        } else if(A%400==0) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
	}
}