class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int new_len = 0;
        
        for(int i = 1; i <= 1024; i *= 2) {
            if(len == i) {
                new_len = i;
                break;
            }
            if(len < i) {
                new_len = i;
                break;
            }
        }
        
        int[] answer = new int[new_len];
        
        for(int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        
        return answer;
    }
}