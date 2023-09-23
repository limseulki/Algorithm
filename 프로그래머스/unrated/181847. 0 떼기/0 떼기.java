class Solution {
    public String solution(String n_str) {
        String answer = "";
        
        for(int i = 0; i < n_str.length(); i++) {
            if(n_str.charAt(i)!='0') {
                for(int j = i; j < n_str.length(); j++) {
                    answer += n_str.charAt(j);
                }
                break;
            }
        }
        
        return answer;
    }
}