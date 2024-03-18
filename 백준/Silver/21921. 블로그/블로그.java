import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        
        int[] visitors = new int[N];
        
        st = new StringTokenizer(br.readLine(), " ");
        
        for(int i = 0; i < N; i++) {
            visitors[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        for(int i = 0; i < X; i++) {
            sum += visitors[i];
        }

        int max = sum;
        int answer = 1;
        
        for(int i = 0; i < N - X; i++) {

            sum += visitors[i + X];
            sum -= visitors[i];

            if(sum == max) {
                answer++;
            }

            if(sum > max) {
                answer = 1;
                max = sum;
            }

        }
        
        if(max == 0) {
            System.out.println("SAD");
        } else {
            System.out.println(max);
            System.out.println(answer);
        }
    }
}