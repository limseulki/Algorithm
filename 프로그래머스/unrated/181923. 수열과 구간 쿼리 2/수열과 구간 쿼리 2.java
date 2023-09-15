class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int j = 0;
        
        for(int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];
            int min = 1000000;
            
            for(int i = s; i <= e; i++) {
                if(arr[i] > k && arr[i] < min) {
                    min = arr[i];
                }
            }
            if(min == 1000000) {
                min = -1;
            }
            answer[j] = min;
            j++;
        }
        
        return answer;
    }
}