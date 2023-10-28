class Solution {
    public int solution(String myString, String pat) {
        String str = "";
        int answer = 0;
        
        for(int i = 0; i < myString.length(); i++) {
            if(myString.charAt(i) == 'A') {
                str += 'B';
            } else {
                str += 'A';
            }
        }
        
        if(str.contains(pat)) {
            answer = 1;
        }        
        
        return answer;
    }
}