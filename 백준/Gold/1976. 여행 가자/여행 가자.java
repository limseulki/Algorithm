import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int p[];

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        
        p = new int[n + 1];
        
        for(int i = 1; i <= n; i++) {
            p[i] = i;
        }
        
        for(int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            
            for(int j = 1; j <= n; j++) {
                if(Integer.parseInt(st.nextToken()) == 1) {
                    union(i, j);
                }
            }
        }
        
        int travel[] = new int[m];
        
        st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < m; i++) {
            travel[i] = Integer.parseInt(st.nextToken());
        }

        int root = find(travel[0]);
        
        for(int t : travel) {
            if(root != find(t)) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

    public static int find(int x) {
        if(x == p[x]) {
            return x;
        }
        return p[x] = find(p[x]);
    }

    public static void union(int x, int y) {
        if(find(x) == find(y)) {
            return;
        }
        p[find(y)] = find(x);
    }
}