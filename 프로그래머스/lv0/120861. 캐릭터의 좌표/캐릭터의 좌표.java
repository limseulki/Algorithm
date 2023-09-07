import java.lang.Math;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        
        for(int i = 0; i < keyinput.length; i++) {
            if(keyinput[i].equals("left")) {
                answer[0] = sizeXCheck(answer[0], board[0]);
                answer[0]--;
            } else if(keyinput[i].equals("right")) {
                answer[0] = sizeXCheck(answer[0], board[0]);
                answer[0]++;
            } else if(keyinput[i].equals("up")) {
                answer[1] = sizeYCheck(answer[1], board[1]);
                answer[1]++;
            } else if(keyinput[i].equals("down")) {
                answer[1] = sizeYCheck(answer[1], board[1]);
                answer[1]--;
            }
        }
        answer[0] = sizeXCheck(answer[0], board[0]);
        answer[1] = sizeYCheck(answer[1], board[1]);
        
        return answer;
    }
    
    public int sizeXCheck(int answer, int board) {
        if(Math.abs(answer) > board/2) {
            if(answer < 0) {
                answer = board/2 * -1;
            } else {
                answer = board/2;
            }
        }
        return answer;
    }
    
    public int sizeYCheck(int answer, int board) {        
        if(Math.abs(answer) > board/2) {
            if(answer < 0) {
                answer = board/2 * -1;
            } else {
                answer = board/2;
            }
        }
        return answer;
    }
}