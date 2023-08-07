class Solution {
    public int solution(int price) {
        int answer = 0;
        
        if(price >= 500_000) {
            answer = (int)(price * 0.8);
        } else if(price >= 300_000) {
            answer = (int)(price * 0.9);
        } else if(price >= 100_000) {
            answer = (int)(price * 0.95);
        } else {
            answer = price;
        }
        
        return answer;
    }
}