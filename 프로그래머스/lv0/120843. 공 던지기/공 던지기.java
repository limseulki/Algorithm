class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int index = 2 * (k - 1) % numbers.length;
        
        answer = numbers[index];
        
        return answer;
    }
}