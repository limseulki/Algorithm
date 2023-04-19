import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
 		int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        if(M>=45) {
            System.out.print(H + " " + (M-45));
        } else {
            if(H != 0){
                System.out.print(H-1 + " " + (M+15));
            } else {
                System.out.print(23 + " " + (M+15));
            }
        } 
	}
}