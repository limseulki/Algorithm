import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        int min = Integer.MAX_VALUE;
        int len = 0;
        
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a') {
                len++;
            }
        }
        for(int i = 0; i < str.length(); i++) {
            int cnt = 0;
            
            for(int j = i; j < len+i; j++) {
                if(str.charAt(j % str.length()) == 'b') {
                    cnt++;
                }
            }
            min = Math.min(min, cnt);
        }
        System.out.println(min);
    }
}