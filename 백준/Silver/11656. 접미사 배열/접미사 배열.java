import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = bf.readLine();
        bf.close();

        String[] suffix = new String[S.length()];

        for(int i = 0; i < S.length(); i++) {
            suffix[i] = S.substring(i);
        }

        Arrays.sort(suffix);
        
        for(int i = 0; i < suffix.length; i++) {
            bw.write(suffix[i] + "\n");
        }
        bw.flush();
        bw.close();
    }
}