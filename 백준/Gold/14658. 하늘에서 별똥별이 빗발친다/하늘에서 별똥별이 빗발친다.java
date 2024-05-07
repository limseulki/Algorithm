import java.util.*;
import java.io.*;

public class Main {
    
    static int N, M, L, K;
    static List<int[]> stars;
    
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        
        stars = new ArrayList<>();
        
        for(int i = 0 ; i < K ; i++) {
            st = new StringTokenizer(br.readLine());
            
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            stars.add(new int[]{x, y});
        }
        
        int answer = Integer.MIN_VALUE;
        
        for(int[] s1 : stars){
            for(int[] s2 : stars){
                answer = Math.max(answer, bound(s1[0], s2[1]));
            }
        }
        System.out.println(K - answer);
    }

    private static int bound(int i, int j) {
        int answer = 0;
        
        for(int[] s : stars){
            if(i <= s[0] && s[0] <= i + L && j <= s[1] && s[1] <= j + L ) {
                answer++;
            }
        }
        return answer;
    }
}