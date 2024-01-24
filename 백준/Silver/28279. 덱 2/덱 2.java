import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int a = 0;
        int b = 0;

        for(int i = 0; i < N; i++) {
            String x = br.readLine();
            if(x.startsWith("1") || x.startsWith("2")) {
                String[] arr = x.split(" ");
                a = Integer.parseInt(arr[0]);
                b = Integer.parseInt(arr[1]);
            } else {
                a = Integer.parseInt(x);
            }

            switch(a) {
                case 1:
                    q.addFirst(b);
                    break;
                case 2:
                    q.add(b);
                    break;
                case 3:
                    if(q.isEmpty()) {
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(q.pollFirst()).append("\n");
                    }
                    break;
                case 4:
                    if(q.isEmpty()) {
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(q.pollLast()).append("\n");
                    }
                    break;
                case 5:
                    sb.append(q.size()).append("\n");
                    break;
                case 6:
                    if(q.isEmpty()) {
                        sb.append("1").append("\n");
                    } else {
                        sb.append("0").append("\n");
                    }
                    break;
                case 7:
                    if(q.isEmpty()) {
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(q.peekFirst()).append("\n");
                    }
                    break;
                case 8:
                    if(q.isEmpty()) {
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(q.peekLast()).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}