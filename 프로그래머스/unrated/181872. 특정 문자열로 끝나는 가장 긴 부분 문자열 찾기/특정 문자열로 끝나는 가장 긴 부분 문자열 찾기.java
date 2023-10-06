class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        
        for(int i = myString.length()-1; i >= 0; i--) {
            String sub = myString.substring(0, i+1);
            if(sub.endsWith(pat)) {
                answer = sub;
                break;
            }
        }
        
        return answer;
    }
}