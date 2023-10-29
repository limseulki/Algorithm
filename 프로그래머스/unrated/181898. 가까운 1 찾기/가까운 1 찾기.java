class Solution {
    public int solution(int[] arr, int idx) {
        int answer = -2;
        
        for(int i = idx; i < arr.length; i++) {
            if(arr[i] == 1) {
                answer = i;
                break;
            }
        }
        
        if(answer == -2) {
            answer = -1;
        }
        
        return answer;
    }
}