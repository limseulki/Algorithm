class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int size = brown + yellow;
        
        for(int i = size / 2; i > 2; i--) {
            if(size % i == 0 && ((i-2) * (size/i-2)) == yellow) {
                answer[0] = i;
                answer[1] = size / i;
                break;
            }
        }
        
        return answer;
    }
}