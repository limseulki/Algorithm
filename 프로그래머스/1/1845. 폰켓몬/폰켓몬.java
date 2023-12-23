import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> havingMon = new HashSet<Integer>();
        
        for(int i = 0; i < nums.length; i++) {
            if(!havingMon.contains(nums[i])) {
                havingMon.add(nums[i]);
            }
        }
        
        if(havingMon.size() > nums.length/2) {
            answer = nums.length/2;
        } else {
            answer = havingMon.size();
        }
        
        return answer;
    }
}