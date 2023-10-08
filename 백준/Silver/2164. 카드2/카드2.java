import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> cards = new LinkedList<>();

        for(int i = 0; i < N; i++) {
            cards.add(i+1);
        }

        while(cards.size() != 1) {
            cards.poll();
            int num = cards.peek();
            cards.poll();
            cards.add(num);
        }

        System.out.println(cards.peek());
        
        br.close();
    }
}