import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] Xs = new int[3];
        int[] Ys = new int[3];
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            Xs[i] = Integer.parseInt(st.nextToken());
            Ys[i] = Integer.parseInt(st.nextToken());
        }

        if (Xs[0] == Xs[1]) {
            sb.append(Xs[2]).append(" ");
        } else if (Xs[0] == Xs[2]) {
            sb.append(Xs[1]).append(" ");
        } else {
            sb.append(Xs[0]).append(" ");
        }

        if (Ys[0] == Ys[1]) {
            sb.append(Ys[2]);
        } else if (Ys[0] == Ys[2]) {
            sb.append(Ys[1]);
        } else {
            sb.append(Ys[0]);
        }

        System.out.println(sb);
        br.close();
    }
}