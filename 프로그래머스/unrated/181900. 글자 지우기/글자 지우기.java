import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";

        Arrays.sort(indices);

        for(int i = 0; i < my_string.length(); i++) {
            boolean isInclud = false;
            
            for(int j = 0; j < indices.length; j++) {
                if(i == indices[j]) {
                    isInclud = true;
                    break;
                }
            }
            
            if(!isInclud) {
                answer += my_string.charAt(i);
            }            
        }
        
        return answer;
    }
}