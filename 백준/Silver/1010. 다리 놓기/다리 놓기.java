import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] arr = new int[30][30];
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int[] answer = new int[T];

        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            answer[i] = combination(M, N);
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }

        br.close();
    }

    public static int combination(int n, int r){
        if(arr[n][r] > 0) {
            return arr[n][r];
        }
        
        if(n == r || r == 0) {
            return arr[n][r] = 1;
        }
        
        return arr[n][r] = combination(n-1, r-1) + combination(n-1, r);
    }
}