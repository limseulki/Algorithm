class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int get = 0;
        int bottle = n;
        
        while(bottle >= a) {
            get = bottle / a * b;
            bottle = bottle - (get / b * a) + get;
            
            answer += get;
        }
        
        return answer;
    }
}