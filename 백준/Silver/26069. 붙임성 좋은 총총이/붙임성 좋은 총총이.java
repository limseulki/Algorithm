import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        Set<String> dancer = new HashSet<>();
        
        dancer.add("ChongChong");
        
        StringTokenizer st;
        
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            
            String A = st.nextToken();
            String B = st.nextToken();
            
            if(dancer.contains(A) || dancer.contains(B)) {
                dancer.add(A);
                dancer.add(B);
            }
        }
        
        System.out.println(dancer.size());
    }
}