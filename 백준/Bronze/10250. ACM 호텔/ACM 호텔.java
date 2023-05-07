import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            int floor = N % H;
            int num = N / H + 1;

            if(floor == 0) {
                if(N/H > H) {
                    floor = H;
                    num = N / H;
                } else {
                    floor = H;
                    num = N / H;
                }
            }

            System.out.println(floor * 100 + num);
        }
        br.close();
    }
}