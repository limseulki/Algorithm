import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        br.close();

        int[] arr = new int[N];
        int count = 0;
        int primeNum = 0;

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

            for(int j = 0; j < arr[i]; j++) {
                if(arr[i] % (j+1) == 0) {
                    count++;
                }
            }
            
            if(count == 2) {
                primeNum++;
            }
            count = 0;
        }
        System.out.println(primeNum);
    }
}