import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] temp = emergency.clone();
        
        Arrays.sort(temp);
        
        for(int i = 0; i < emergency.length; i++) {
            for(int j = 0; j <temp.length; j++) {
                if(emergency[i] == temp[j]) {
                    answer[i] = emergency.length - j;
                }
            }
        }
        
        return answer;
    }
}