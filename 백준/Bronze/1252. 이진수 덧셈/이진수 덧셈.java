import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger num1 = new BigInteger(st.nextToken(), 2);
        BigInteger num2 = new BigInteger(st.nextToken(), 2);

        BigInteger sum = num1.add(num2);

        String answer = sum.toString(2);

        System.out.println(answer);

        br.close();
    }
}