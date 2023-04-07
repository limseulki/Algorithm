class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int countP = 0;
        int countY = 0;
        
        for(int i = 0; i < s.length(); i++) {
            if(s.substring(i,i+1).equals("P") 
               || s.substring(i,i+1).equals("p")) {
                countP++;
            }
            if(s.substring(i,i+1).equals("y") 
               || s.substring(i,i+1).equals("Y")) {
                countY++;
            }
        }        
        if(countP == countY) {
            answer = true;
        } else {
            answer = false;
        }

        return answer;
    }
}