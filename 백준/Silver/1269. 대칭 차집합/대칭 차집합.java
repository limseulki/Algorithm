import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < a; i++) {
            A.add(Integer.parseInt(st.nextToken()));
        }
        
        st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < b; i++) {
            B.add(Integer.parseInt(st.nextToken()));
        }

        int result = 0;
        
        for(int num : A) {
            if(!B.contains(num)) {
                result += 1;
            }
        }
        
        for(int num : B) {
            if(!A.contains(num)) {
                result += 1;
            }
        }
        
        System.out.println(result);
    }
}