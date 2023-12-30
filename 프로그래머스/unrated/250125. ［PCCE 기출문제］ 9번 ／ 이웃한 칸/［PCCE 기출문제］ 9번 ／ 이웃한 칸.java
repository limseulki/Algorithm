class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        String color = board[h][w];
        
        int[][] dir = {{0,-1}, {0,1}, {-1,0}, {1,0}};
        
        for(int i = 0; i < dir.length; i++) {
            int dh = h + dir[i][0];
            int dw = w + dir[i] [1];
            
            if(dh >= 0 && dh < board.length && dw >= 0 && dw < board[0].length) {
                if(color.equals(board[dh][dw])) {
                    answer ++;
                }
            }
        }

        return answer;
    }
}