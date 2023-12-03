class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i = 0; i < s.length(); i++) {
            int newNum = (int)s.charAt(i) + n;
            char newChar;
            
            if(Character.isUpperCase(s.charAt(i)) && newNum > 90 || 
               Character.isLowerCase(s.charAt(i)) && newNum > 122) {
                newNum = newNum - 26;
                newChar = (char)newNum;
                
                answer += String.valueOf(newChar);
            } else if(s.charAt(i) == ' ') {
                answer += " ";
            } else {
                newNum = newNum;
                newChar = (char)newNum;
                
                answer += String.valueOf(newChar);
            }
        }

        return answer;
    }
}