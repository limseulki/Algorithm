class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        boolean isChange = true;
        
        while(isChange) {
            isChange = false;
            
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                    isChange = true;
                } else if(arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] *= 2;
                    arr[i]++;
                    isChange = true;
                }
            }
            
            answer++;
        }
        
        answer--;
        
        return answer;
    }
}