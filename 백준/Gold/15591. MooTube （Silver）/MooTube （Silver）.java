import java.util.*;

public class Main {
    
    static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();

        List<int[]>[] adj = new ArrayList[N + 1];

        for(int i = 1; i <= N; i++)
            adj[i] = new ArrayList<>();

        for(int i = 1; i < N; i++) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            int r = sc.nextInt();
            
            adj[p].add(new int[]{q, r});
            adj[q].add(new int[]{p, r});
        }

        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < Q; i++) {
            int k = sc.nextInt();
            int v = sc.nextInt();

            boolean[] visit = new boolean[N + 1];
            visit[v] = true;
            
            Queue<Integer> que = new LinkedList<>();
            que.add(v);

            int ans = 0;
            
            while(!que.isEmpty()) {
                int cur = que.poll();

                for(int[] a : adj[cur]) {
                    if(!visit[a[0]] && a[1] >= k) {
                        que.add(a[0]);
                        visit[a[0]] = true;
                        ans++;
                    }
                }
            }
            sb.append(ans).append('\n');
        }
        System.out.println(sb.toString());
    }
}