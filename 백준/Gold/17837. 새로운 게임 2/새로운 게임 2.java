import java.io.*;
import java.util.*;

public class Main {
    
    private static int N, K;
    private static int[][] map;
    private static List<Integer>[][] chessMap;
    private static ArrayList<Chess> chessList;
    private static final int[][] direction = {{0, 1}, {0, -1}, {-1, 0}, {1, 0}};

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        map = new int[N][N];
        chessMap = new ArrayList[N][N];
        
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            
            for(int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                chessMap[i][j] = new ArrayList<>();
            }
        }

        chessList = new ArrayList<>();
        
        for(int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;
            int d = Integer.parseInt(st.nextToken()) - 1;
            
            chessList.add(new Chess(x, y, d));
            chessMap[x][y].add(i);
        }

        sb.append(sol());
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int sol() {
        for(int turn = 1; turn <= 1000; turn++) {
            for(int i = 0; i < chessList.size(); i++) {
                Chess c = chessList.get(i);
                
                int nx = c.x + direction[c.d][0];
                int ny = c.y + direction[c.d][1];

                if(go(i, c.x, c.y, nx, ny, false, c.d)) {
                    return turn;
                }
            }
        }
        return -1;
    }

    private static boolean go(int chess, int x, int y, int nx, int ny, boolean status, int d) {
        if(nx < 0 || nx >= N || ny < 0 || ny >= N || map[nx][ny] == 2) {
            if(status) {
                return false;
            }
            if(d <= 1) {
                d = d == 1 ? 0 : 1;
            } else {
                d = d == 2 ? 3 : 2;
            }
            chessList.get(chess).d = d;

            nx = x + direction[d][0];
            ny = y + direction[d][1];

            return go(chess, x, y, nx, ny, true, d);
        } else {
            List<Integer> leavedChessList = new ArrayList<>(chessMap[x][y].subList(0, chessMap[x][y].indexOf(chess)));
            List<Integer> movedChessList = new ArrayList<>(chessMap[x][y].subList(chessMap[x][y].indexOf(chess), chessMap[x][y].size()));

            if(map[nx][ny] == 1) {
                Collections.reverse(movedChessList);
            }

            chessMap[nx][ny].addAll(movedChessList);
            
            if(chessMap[nx][ny].size() >= 4) {
                return true;
            }

            for(int idx : movedChessList) {
                chessList.get(idx).x = nx;
                chessList.get(idx).y = ny;
            }

            chessMap[x][y] = leavedChessList;
        }

        return false;
    }

    static class Chess {
        int x, y, d;

        public Chess(int x, int y, int d) {
            this.x = x;
            this.y = y;
            this.d = d;
        }
    }
}