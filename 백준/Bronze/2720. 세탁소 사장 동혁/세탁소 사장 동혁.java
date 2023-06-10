import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int quater = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < T; i++) {
            int C = Integer.parseInt(br.readLine());

            sb.append(C / quater + " ");
            C %= quater;
            sb.append(C / dime + " ");
            C %= dime;
            sb.append(C / nickel + " ");
            C %= nickel;
            sb.append(C / penny + "\n");
        }
        System.out.println(sb);
    }
}