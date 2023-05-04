import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken();
        String B = st.nextToken();
        char[] numA = new char[3];
        char[] numB = new char[3];

        for(int i = 0; i < 3; i++) {
            numA[2-i] = A.charAt(i);
            numB[2-i] = B.charAt(i);
        }
        int intA = Integer.parseInt(new String(numA));
        int intB = Integer.parseInt(new String(numB));

        if(intA > intB) {
            System.out.println(intA);
        } else {
            System.out.println(intB);
        }
    }
}