class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 1;
        
        while(n >= num) {
            n /= num;
            num++;
            answer++;
        }
        
        return answer;
    }
}