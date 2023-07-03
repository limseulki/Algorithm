import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] X = new int[N];
        int[] Y = new int[N];
        int minX = 10000;
        int maxX = -10000;
        int minY = 10000;
        int maxY = -10000;

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            X[i] = Integer.parseInt(st.nextToken());
            Y[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < N; i++) {
            if(X[i] > maxX) {
                maxX = X[i];
            }
            if(X[i] < minX) {
                minX = X[i];
            }
            if(Y[i] > maxY) {
                maxY = Y[i];
            }
            if(Y[i] < minY) {
                minY = Y[i];
            }
        }

        int result = (maxX - minX) * (maxY - minY);
        System.out.println(result);

    }
}