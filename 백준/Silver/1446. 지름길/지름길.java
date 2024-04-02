import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
    static class spot{
        int start;
        int dist;
        
        spot(int start, int dist){
            this.start = start;
            this.dist = dist;
        }
    }
    
    static ArrayList<spot>[] path;
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        int[] distance = new int[D+1];
        path = new ArrayList[10001];
        
        Arrays.fill(distance, Integer.MAX_VALUE);
        
        for(int i = 0; i < 10001; i++) {
            path[i] = new ArrayList<>();
        }

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int dist = Integer.parseInt(st.nextToken());

            if(e - s > dist) {
                path[e].add(new spot(s, dist));
            }
        }

        distance[0] = 0;
        
        for(int i = 1; i <= D; i++) {
            if(path[i].size() > 0){
                for(spot s : path[i]) {
                    if(distance[s.start]+s.dist > distance[i]) continue;
                    distance[i] = Math.min(distance[i-1] + 1, distance[s.start] + s.dist);
                }
                continue;
            }
            distance[i] = distance[i-1] + 1;
        }
        System.out.println(distance[D]);
    }
}