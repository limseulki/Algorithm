import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int back = 0;

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            String method = st.nextToken();

            switch (method) {
                case "push" :
                    int value = Integer.parseInt(st.nextToken());
                    back = value;
                    queue.add(value);
                    break;
                case "pop" :
                    if (queue.size() == 0) {
                        sb.append(-1);
                        sb.append("\n");
                    } else {
                        sb.append(queue.poll());
                        sb.append("\n");
                    }
                    break;
                case "size" :
                    sb.append(queue.size());
                    sb.append("\n");
                    break;
                case "empty" :
                    if (queue.isEmpty()) {
                        sb.append(1);
                        sb.append("\n");
                    } else {
                        sb.append(0);
                        sb.append("\n");
                    }
                    break;
                case "front" :
                    if (queue.size() == 0) {
                        sb.append(-1);
                        sb.append("\n");
                    } else {
                        sb.append(queue.peek());
                        sb.append("\n");
                    }
                    break;
                case "back" :
                    if (queue.size() == 0) {
                        sb.append(-1);
                        sb.append("\n");
                    } else {
                        sb.append(back);
                        sb.append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb);

        br.close();
    }
}