import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        String nums = my_string.replaceAll("[^0-9]", "");
        char[] char_nums = nums.toCharArray();
        int[] answer = new int[nums.length()];
    
        Arrays.sort(char_nums);
        for(int i = 0; i < char_nums.length; i++) {
            answer[i] = char_nums[i]-'0';
        }
        
        return answer;
    }
}