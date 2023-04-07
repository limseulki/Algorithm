class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long pay = 0;
        
        for(int i = 0; i < count; i++) {
            pay += price * (i + 1);
        }
        answer = pay - money;
        
        if(pay < money) {
            answer = 0;
        }
        return answer;
    }
}