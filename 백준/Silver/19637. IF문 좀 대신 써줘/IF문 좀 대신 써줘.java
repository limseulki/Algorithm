import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[][] name = new String[N][2];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            
            name[i][0] = st.nextToken();
            name[i][1] = st.nextToken();
        }

        for(int i = 0; i < M; i++) {
            int num = Integer.parseInt(br.readLine());

            int left = 0;
            int right = N - 1;
            int mid = (left + right) / 2;
            
            while(left <= right){
                mid = (left + right) / 2;

                int nameInt = Integer.parseInt(name[mid][1]);
                
                if(nameInt < num) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            sb.append(name[left][0] + "\n");
        }
        System.out.print(sb);
    }
}