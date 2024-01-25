import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Deque<Integer> q = new ArrayDeque<>();

        st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < N; i++){
            int a = Integer.parseInt(st.nextToken());
            if(arr[i] == 0){
                q.addLast(a);
            }
        }

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        
        while(M --> 0){
            int b = Integer.parseInt(st.nextToken());
            q.addFirst(b);
            sb.append(q.pollLast()).append(" ");
        }

        System.out.println(sb);
        
        br.close();
    }
}