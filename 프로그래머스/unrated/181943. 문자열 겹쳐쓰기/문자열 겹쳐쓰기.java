class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int len = overwrite_string.length();
        String sub = my_string.substring(0, s);
        int len_sub = sub.length();
        
        answer = sub + overwrite_string + my_string.substring(len_sub + len);
        
        return answer;
    }
}