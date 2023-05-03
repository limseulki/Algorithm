import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String S = bf.readLine();
        String[] suffix = new String[S.length()];

        for(int i = 0; i < S.length(); i++) {
            suffix[i] = S.substring(i);
        }

        Arrays.sort(suffix);

        for(int i = 0; i < suffix.length; i++) {
            System.out.println(suffix[i]);
        }
    }
}