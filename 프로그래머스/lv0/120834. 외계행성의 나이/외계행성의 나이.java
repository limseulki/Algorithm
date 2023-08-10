class Solution {
    public String solution(int age) {
        String answer = "";
        String str_age = Integer.toString(age);
        
        for(int i = 0; i < str_age.length(); i++) {
            answer += (char)(str_age.charAt(i) + 49);
        }
        
        return answer;
    }
}