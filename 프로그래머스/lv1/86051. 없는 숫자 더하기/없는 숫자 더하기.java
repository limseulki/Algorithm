class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        int number = 0;
        
        for(int i = 0; i < numbers.length; i++) {
            number += numbers[i];
        }
        
        answer = 45 - number;
        return answer;
    }
}