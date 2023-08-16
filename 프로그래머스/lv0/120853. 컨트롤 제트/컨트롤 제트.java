import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] nums = s.split(" ");
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i].equals("Z")) {
                answer -= Integer.parseInt(nums[i-1]);
            } else {
                answer += Integer.parseInt(nums[i]);
            }
        }       
        
        return answer;
    }
}