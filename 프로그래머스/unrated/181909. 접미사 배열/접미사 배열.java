import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        
        for(int i = my_string.length()-1; i >= 0; i--) {
            answer[i] = my_string.substring(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}