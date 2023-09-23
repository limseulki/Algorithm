class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        
        for(int i = 1; i <= strArr.length; i++) {
            if(i % 2 != 0) {
                answer[i-1] = strArr[i-1].toLowerCase();
            } else {
                answer[i-1] = strArr[i-1].toUpperCase();
            }
        }
        
        return answer;
    }
}