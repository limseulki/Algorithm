import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String a = br.readLine();
        for(int i = 0; i < a.length()/10; i++) {
            String b = a.substring(i*10,i*10+10);
            System.out.println(b);
        }
        int n = a.length() % 10;
        System.out.println(a.substring(a.length()-n));
    }
}