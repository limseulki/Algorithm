import java.lang.*;

class Solution {
    public String[] solution(String my_str, int n) {
        int index = (int)Math.ceil((double) my_str.length()/n);
        String[] answer = new String[index];
        
        int i = 0;
        
        while(i < index) {
            int start = i * n;
            int end = Math.min(start+n, my_str.length());
            answer[i] = my_str.substring(start, end);
            i++;
        }
        
        return answer;
    }
}