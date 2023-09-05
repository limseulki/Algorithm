import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        answer = my_string.toLowerCase();
        
        char[] charArr = answer.toCharArray();
        Arrays.sort(charArr);
        
        answer = String.valueOf(charArr);
        
        return answer;
    }
}