import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		String N = br.readLine();
        
		int i = 0;
        
		while(true) {
			i++;
			String num = Integer.toString(i);
            
			while(num.length() > 0 && N.length() > 0) {
				if(num.charAt(0) == N.charAt(0)) {
					N = N.substring(1);
				}
				num = num.substring(1);
			}
			if(N == "") {
				System.out.println(i);
				break;
			}
		}
	}
}