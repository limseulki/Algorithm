import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] splitS = s.split(" ");
        int[] nums = new int[splitS.length];
        
        for(int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(splitS[i]);
        }
        
        Arrays.sort(nums);
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(nums[0]+" "+nums[nums.length-1]);
        
        answer = sb.toString();
        
        return answer;
    }
}