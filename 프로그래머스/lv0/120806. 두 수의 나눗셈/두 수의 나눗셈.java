class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        double num_1 = num1;
        double num_2 = num2;
        
        double num = num_1/num_2*1000;
        
        answer = (int) num;
        
        return answer;
    }
}