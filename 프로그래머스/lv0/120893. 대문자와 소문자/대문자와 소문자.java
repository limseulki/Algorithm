class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++) {
            char my_char = my_string.charAt(i);
            
            if(Character.isLowerCase(my_char)) {
                answer += Character.toUpperCase(my_char);
            } else {
                answer += Character.toLowerCase(my_char);
            }
        }
        
        return answer;
    }
}