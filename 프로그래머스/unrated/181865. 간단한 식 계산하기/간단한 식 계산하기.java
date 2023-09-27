class Solution {
    public int solution(String binomial) {
        int answer = 0;
        
        String[] str = binomial.split(" ");
        
        int num1 = Integer.parseInt(str[0]);
        int num2 = Integer.parseInt(str[2]);
        
        if(str[1].equals("+")) {
            answer = num1 + num2;
        } else if(str[1].equals("-")) {
            answer = num1 - num2;
        } else {
            answer = num1 * num2;
        }
        
        return answer;
    }
}