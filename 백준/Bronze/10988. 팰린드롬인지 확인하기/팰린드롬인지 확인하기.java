import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());
        br.close();

        System.out.println(((sb.toString().equals(sb.reverse().toString())) ? 1 : 0) + "\n");
    }
}