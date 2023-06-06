import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int king = Integer.parseInt(st.nextToken());
        int queen = Integer.parseInt(st.nextToken());
        int rooks = Integer.parseInt(st.nextToken());
        int bishops = Integer.parseInt(st.nextToken());
        int knights = Integer.parseInt(st.nextToken());
        int pawns = Integer.parseInt(st.nextToken());

        int kingAnswer = 1 - king;
        int queenAnswer = 1 - queen;
        int rooksAnswer = 2 - rooks;
        int bishopsAnswer = 2 - bishops;
        int knightsAnswer = 2 - knights;
        int pawnsAnswer = 8 - pawns;

        System.out.println(kingAnswer+" "+queenAnswer+" "+rooksAnswer+" "+bishopsAnswer
                +" "+knightsAnswer+" "+pawnsAnswer);
    }
}