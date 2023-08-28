import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> answer_list = new ArrayList<>();
        
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) {
                answer_list.add(numlist[i]);
            }
        }
        
        int[] answer = new int[answer_list.size()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = answer_list.get(i);
        }
        
        return answer;
    }
}