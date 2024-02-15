import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] num = new boolean[1000001];
        
        num[0] = true;
        num[1] = true;
        
        for(int i = 2; i * i <= 1000000; i++) {
            if(!num[i]) {
                for(int j = i + i; j <= 1000000; j += i) {
                    num[j] = true;
                }
            }
        }
        
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++) {
            int tmp = Integer.parseInt(br.readLine());
            int result = 0;
         
            for(int j = 2; j <= tmp / 2; j++) {
                if(!num[j] && !num[tmp - j]) {
                    result++;
                }
            }
            System.out.println(result);
        }
    }
}