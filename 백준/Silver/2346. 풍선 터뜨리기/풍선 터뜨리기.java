import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        Deque<Balloon> q = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] location = new int[N];
        
        for(int i = 0; i < N; i++) {
            location[i] = Integer.parseInt(st.nextToken());
        }

        sb.append("1 ");
        int move = location[0];

        for(int i = 1; i < N; i++){
            q.add(new Balloon(i+1, location[i]));
        }

        while(!q.isEmpty()){
            if(move > 0){
                for(int i = 1; i < move; i++) {
                    q.add(q.poll());
                }
                Balloon next = q.poll();
                move = next.num;
                sb.append(next.index+" ");
            } else {
                for(int i = 1; i < -move; i++) {
                    q.addFirst(q.pollLast());
                }
                Balloon next = q.pollLast();
                move = next.num;
                sb.append(next.index+" ");
            }

        }
        System.out.println(sb);
        br.close();
    }
}

class Balloon{
    int index;
    int num;

    public Balloon(int index, int num) {
        this.index = index;
        this.num = num;
    }
}
       