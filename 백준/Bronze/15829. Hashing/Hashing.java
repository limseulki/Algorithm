import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        String word = br.readLine();
        br.close();

        BigInteger answer = new BigInteger("0");

        for(int i = 0; i < L; i ++) {
            answer = answer.add(BigInteger.valueOf(word.charAt(i)-96).multiply(BigInteger.valueOf(31).pow(i)));
        }
        System.out.println(answer.remainder(BigInteger.valueOf(1234567891)));
    }
}