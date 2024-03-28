import java.util.*;
import java.io.*;
 
public class Main {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();        
        
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            pq.offer(num);
        }
 
        for(int i = 1; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            
            for(int j = 0; j < N; j++) {
                int num = Integer.parseInt(st.nextToken());
 
                if(pq.peek() < num) {
                    pq.poll();
                    pq.offer(num);
                }
            }
        }
        System.out.println(pq.poll());
    }
}