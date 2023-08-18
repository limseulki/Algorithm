import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> factors = new ArrayList<>();
        
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                factors.add(i);
            }
        }
        
        int[] answer = new int[factors.size()];
        
        for(int i = 0; i < factors.size(); i++){
            answer[i] = factors.get(i);
        }
        
        return answer;
    }
}