import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int C = Integer.parseInt(br.readLine());

        for(int i = 0; i < C; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());

            int[] score = new int[N];
            int sum = 0;
            int count = 0;

            for(int j = 0; j < N; j++) {
                score[j] = Integer.parseInt(st.nextToken());
                sum += score[j];
            }
            double average = (double) sum / N;

            for(int j = 0; j < N; j++) {
                if(score[j] > average) {
                    count++;
                }
            }
            double result = (double) count / N * 100;
            String answer = String.format("%.3f", result);

            System.out.println(answer+"%");
        }
    }
}