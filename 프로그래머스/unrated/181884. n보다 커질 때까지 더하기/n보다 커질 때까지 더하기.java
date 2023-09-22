class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int cnt = 0;
        
        while(answer <= n) {
            answer += numbers[cnt];
            cnt++;
        }
        
        return answer;
    }
}