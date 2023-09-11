class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String fir = String.valueOf(a) + String.valueOf(b);
        String sec = String.valueOf(b) + String.valueOf(a);
        
        int fir_int = Integer.parseInt(fir);
        int sec_int = Integer.parseInt(sec);
        
        if(fir_int >= sec_int) {
            answer = fir_int;
        } else {
            answer = sec_int;
        }
        
        return answer;
    }
}