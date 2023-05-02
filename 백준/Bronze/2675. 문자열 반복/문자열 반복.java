import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++) {
            String[] s = br.readLine().split(" ");
            
            int R = Integer.parseInt(s[0]);
            String S = s[1];
            
            for(int j = 0; j < S.length(); j++) {
                for(int k = 0; k < R; k++) {
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }
        br.close();
    }
}