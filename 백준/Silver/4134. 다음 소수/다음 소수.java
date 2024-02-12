import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        long[] numbers = new long[n];

        for(int i = 0; i < n; i++) {
            numbers[i] = Long.parseLong(br.readLine());
        }

        for(int i = 0; i < numbers.length; i++) {
            BigInteger bigNumber = new BigInteger(String.valueOf(numbers[i]));
            
            bw.write(findPrimeNumber(bigNumber) + "\n");
        }

        bw.flush();
        bw.close();
        
        br.close();
    }

    static BigInteger findPrimeNumber(BigInteger num) {

        if(num.isProbablePrime(10)) {
            return num;
        } else {
            return num.nextProbablePrime();
        }
    }

}