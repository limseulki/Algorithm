import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            if(A == 0 && B == 0 && C == 0) {
                break;
            }

            if(A == B && B == C) {
                sb.append("Equilateral\n");
            } else if(A >= B+C || B >= C+A || C >= A+B) {
                sb.append("Invalid\n");
            } else if(A == B || B == C || A == C) {
                sb.append("Isosceles\n");
            } else if(A != B && B != C && C != A) {
                sb.append("Scalene\n");
            } else {
                sb.append("Invalid\n");
            }
        }
        System.out.println(sb);
        br.close();
    }
}