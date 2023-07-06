import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        sort(N, arr);

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void sort(int N, int[] arr) {
        int temp;

        for(int j = 0; j < N-1; j++) {
            for (int i = 0; i < N-1; i++) {
                if (arr[i] > arr[i+1]) {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
}