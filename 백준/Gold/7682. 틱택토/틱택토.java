import java.io.*;
import java.util.*;

public class Main {
    
    static char[][] board;
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        String input = "";
        board = new char[3][3];
        
        while(true) {
            st = new StringTokenizer(br.readLine(), " ");
            input = st.nextToken();
            
            if(Objects.equals(input, "end")) {
                break;
            }
            
            int index = 0;
            int xCount = 0;
            int oCount = 0;
            
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    board[i][j] = input.charAt(index);
                    if(board[i][j] == 'O') {
                        oCount++;
                    } else if(board[i][j] == 'X') {
                        xCount++;
                    }
                    index++;
                }
            }
            
            if(xCount + oCount == 9 && xCount - oCount == 1) {
                if(isValid('X') && isValid('O')) {
                    bw.write("invalid\n");
                } else if(isValid('O')) {
                    bw.write("invalid\n");
                } else {
                    bw.write("valid\n");
                }
            } else {
                if(isValid('X') && isValid('O')) {
                    bw.write("invalid\n");
                } else if(isValid('X') && xCount - oCount == 1) {
                    bw.write("valid\n");
                } else if(isValid('O') && xCount == oCount) {
                    bw.write("valid\n");
                } else {
                    bw.write("invalid\n");
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }

    public static boolean isValid(char c) {
        for(int i = 0; i < 3; i++) {
            int count = 0;
            
            for(int j = 0; j < 3; j++) {
                if(board[i][j] == c) {
                    count++;
                }
            }
            
            if(count == 3) {
                return true;
            }
        }

        for(int i = 0; i < 3; i++) {
            int count = 0;
            
            for(int j = 0; j < 3; j++) {
                if (board[j][i] == c) {
                    count++;
                }
            }
            
            if(count == 3) {
                return true;
            }
        }

        if(board[0][0] == c && board[1][1] == c && board[2][2] == c) {
            return true;
        }
        
        if(board[0][2] == c && board[1][1] == c && board[2][0] == c) {
            return true;
        }
        
        return false;
    }
}