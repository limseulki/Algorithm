class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if(s.matches("^[0-9]*$")) {
            answer = true;
        }
        else
            answer = false;
        
        if(s.length() < 4)
            answer = false;
        else if(s.length() > 6)
            answer = false;
        else if(s.length() == 5)
            answer = false;
        
        return answer;
    }
}