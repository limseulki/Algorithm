import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> hallOfFame = new ArrayList();
        
        for(int i = 0 ; i < score.length; i++) {
            if(i < k) {
                hallOfFame.add(score[i]);
            } else {
                if(hallOfFame.get(0) <= score[i]) {
                    hallOfFame.remove(0);
                    hallOfFame.add(score[i]);
                }
            }            
            Collections.sort(hallOfFame);            
            answer[i] = hallOfFame.get(0);
        }
        
        return answer;
    }
}