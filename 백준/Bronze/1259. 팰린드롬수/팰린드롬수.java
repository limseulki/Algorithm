import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            String number = br.readLine();
            int N = number.length();
            boolean b = true;

            if(number.equals("0")) {
                break;
            }
            for(int i = 0; i <= N/2; i++) {
                if(number.charAt(i) != number.charAt(N-i-1)) {
                    b = false;
                }
            }
            if(b) {
                sb.append("yes\n");
            } else {
                sb.append("no\n");
            }
        }
        System.out.println(sb);

    }
}