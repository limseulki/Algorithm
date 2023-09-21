class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String lower_myString = myString.toLowerCase();
        String lower_pat = pat.toLowerCase();
        
        if(lower_myString.contains(lower_pat)) {
            answer = 1;
        }
        
        return answer;
    }
}