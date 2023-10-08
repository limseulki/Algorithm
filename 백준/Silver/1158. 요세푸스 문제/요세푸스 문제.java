import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> people = new LinkedList<>();

        for(int i = 0; i < N; i++) {
            people.add(i+1);
        }

        sb.append("<");

        while(!people.isEmpty()) {
            for(int i = 0; i < K; i++) {
                if(i == K-1) {
                    sb.append(people.peek());
                    if(people.size() != 1) {
                        sb.append(", ");
                    }
                    people.poll();
                } else {
                    people.add(people.peek());
                    people.poll();
                }
            }
        }

        sb.append(">");

        System.out.println(sb);

        br.close();
    }
}