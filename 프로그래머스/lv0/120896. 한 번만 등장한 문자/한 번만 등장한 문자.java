import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr_s = s.split("");
        int count = 0;
        
        Arrays.sort(arr_s);
        
        for(int i = 0; i < arr_s.length; i++) {
            count = 0;
            
            for(int j = 0; j < arr_s.length; j++) {
                if(arr_s[i].equals(arr_s[j])) {
                    count++;
                }
            }
            
            if(count == 1) {
                answer += arr_s[i];
            }
        }
        
        return answer;
    }
}