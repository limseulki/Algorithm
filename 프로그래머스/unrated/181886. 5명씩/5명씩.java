import java.lang.Math;

class Solution {
    public String[] solution(String[] names) {
        String[] answer = new String[(int)Math.ceil((double)names.length/5)];
        
        for(int i = 0; i < names.length; i+=5) {
            answer[i/5] = names[i];
        }
        
        return answer;
    }
}