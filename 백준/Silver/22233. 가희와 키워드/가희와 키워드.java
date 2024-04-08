import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<String, Integer> keyword = new HashMap<>();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N; i++) {
            keyword.put(br.readLine(), 1);
        }

        for(int i = 0; i < M; i++) {
            String[] str = br.readLine().split(",");

            for(int j = 0; j < str.length; j++) {
                if(keyword.containsKey(str[j]) && keyword.get(str[j]) == 1){
                    N--;
                    keyword.put(str[j], 0);
                }
            }
            System.out.println(N);
        }
    }
}