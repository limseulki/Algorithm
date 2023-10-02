import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> answerList = new ArrayList<>();
        
        for(int i = 0; i < flag.length; i++) {
            if(flag[i] == true) {
                for(int j = 0; j < arr[i]*2; j++) {
                    answerList.add(arr[i]);
                }
            } else {
                for(int k = 0; k < arr[i]; k++) {
                    answerList.remove(answerList.size()-1);
                }
            }
        }
        
        int[] answer = new int[answerList.size()];
        
        for(int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}