class Solution {
    public String solution(String myString) {
        String answer = "";
        
        answer = myString.toLowerCase();
        answer = answer.replace('a', 'A');
        
        return answer;
    }
}