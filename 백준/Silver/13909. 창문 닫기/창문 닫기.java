import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int count = 0;
        
        for(int i = 1; i * i <= N; i++) {
            count++;
        }

        System.out.println(count);

        br.close();
    }
}