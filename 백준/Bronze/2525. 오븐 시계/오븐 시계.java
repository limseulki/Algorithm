import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(br.readLine());
        
        int min = 60 * A + B;
        min += C;
        
        int H = (min/60) % 24;
        int M = min % 60;
        
        System.out.print(H+" "+M);
        
    }
}
