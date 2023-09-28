import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] canvas = new int[100][100];
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for(int j = x; j < x+10; j++) {
                for(int k = y; k < y+10; k++) {
                    canvas[j][k]++;
                }
            }
        }

        int overlap = 0;

        for(int i = 0; i < 100; i++) {
            for(int j = 0; j < 100; j++) {
                for(int k = 2; k <= n; k++) {
                    if(canvas[i][j] == k) {
                        overlap += k-1;
                    }
                }
            }
        }

        int answer = n*100 - overlap;

        System.out.println(answer);

        br.close();
    }
}