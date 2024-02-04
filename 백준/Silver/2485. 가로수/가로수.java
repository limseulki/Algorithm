import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] tree = new int[N];

        for(int i = 0; i < N; i++) {
            tree[i]=Integer.parseInt(br.readLine());
        }

        br.close();

        int gcd = 0;

        for(int i = 0; i < N-1; i++) {
            int distance = tree[i+1] - tree[i];
            gcd = findGCD(distance, gcd);
        }

        bw.write((tree[N-1] - tree[0]) / gcd + 1 - (tree.length) + "");
        bw.flush();
        bw.close();

    }

    static int findGCD(int A, int B){
        while(B != 0){
            int C = A % B;
            A = B;
            B = C;
        }
        return A;
    }
}