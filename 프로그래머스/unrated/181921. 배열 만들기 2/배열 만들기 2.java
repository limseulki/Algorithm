import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> result = new ArrayList<>();

        for (;l<=r;l++){
          if(contains(l)) {
                result.add(l);
            }
        }

        int[] answer = new int[result.size()];

        if(result.isEmpty()) {
            answer = new int[]{-1}; 
        } else {
            for (int i = 0; i < result.size(); i++) {
                answer[i] = result.get(i);
            }
        }
        return answer;
    }

    private boolean contains(int num){
        while(num > 0) {
            int digit = num % 10;
            
           if (digit != 0 && digit != 5) {
                return false;
            }
            num = num / 10;
        }
        
        return true;
    }
}