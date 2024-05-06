import java.io.*;
import java.util.*;
 
public class Main {
    
    static int[] map;
    static int N;
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        N = Integer.parseInt(br.readLine());
        map = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < N; i++) {
            map[i] = Integer.parseInt(st.nextToken());
        }
        
        int answer = 0;
        
        for(int i = 0; i < N; i++) {
            answer = Math.max(answer, Count(i));
        }
        System.out.println(answer);
    }
    
    public static int Count(int index) {
        int count = 0;
        double tmp = 0;
        
        for(int i = index - 1; i >= 0; i--) {
            double slope = (double)(map[index] - map[i]) / (index - i);
           
            if(i == index - 1 || tmp > slope) {
                count++;
                tmp = slope;
            }
        }
        
        for(int i = index + 1; i < N; i++) {
            double slope = (double)(map[index] - map[i]) / (index - i);
            
            if(i == index + 1 || tmp < slope) {
                count++;
                tmp = slope;
            }
        }
        return count;
    }
}