import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        br.close();

        int count = 0;

        for(int i = 1; i <= X; i++) {
            for(int j = 1; j <= i; j++) {
                if(count >= X) {
                    break;
                }
                if(i % 2 == 0){
                    count++;
                    if(count == X) {
                        System.out.println(j + "/" + (i+1-j));
                    }
                } else {
                    count++;
                    if(count == X) {
                        System.out.println((i+1-j) + "/" + j);
                    }
                }
            }
        }
    }
}