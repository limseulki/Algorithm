class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int fir = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int sec = 2 * a * b;
        
        if(fir >= sec) {
            answer = fir;
        } else {
            answer = sec;
        }
        
        return answer;
    }
}