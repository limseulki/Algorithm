import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sb = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(sb.nextToken());
        int k = Integer.parseInt(sb.nextToken());

        int[] x = new int[N];
        StringTokenizer sb2 = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < N; i++) {
            x[i] = Integer.parseInt(sb2.nextToken());
        }

        Arrays.sort(x);

        System.out.println(x[N-k]);
    }
}