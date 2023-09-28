import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] numbers = new int[9][9];
        int max = 0;
        int index_x = 0;
        int index_y = 0;

        for(int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < 9; j++) {
                numbers[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(max < numbers[i][j]) {
                    max = numbers[i][j];
                    index_x = i + 1;
                    index_y = j + 1;
                }
            }
        }
        
        if(max == 0) {
            index_x = 1;
            index_y = 1;
        }

        System.out.println(max);
        System.out.println(index_x + " " + index_y);
    }
}