import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++) {            
            int a = commands[i][0];
            int b = commands[i][1];
            int[] temp = new int[b - a + 1];
            
            for(int j = 0; j <= b - a; j++) {
                temp[j] = array[j + a - 1];
            }
            
            Arrays.sort(temp);
            
            answer[i] = temp[commands[i][2] - 1];
        }
        
        return answer;
    }
}