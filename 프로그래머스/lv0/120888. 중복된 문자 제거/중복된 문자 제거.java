class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++) {
            int exist = 0;
            
            for(int j = 0; j < answer.length(); j++) {
                if(my_string.charAt(i) == answer.charAt(j)) {
                    exist++;
                }
            }
            
            if(exist == 0) {
                answer += my_string.charAt(i);
            }
        }
        
        return answer;
    }
}