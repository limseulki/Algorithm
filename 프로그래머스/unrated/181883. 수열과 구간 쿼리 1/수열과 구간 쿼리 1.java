class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        
        for(int[] query : queries) {
            int s = query[0];
            int e = query[1];
            
            for(int i = s; i <= e; i++) {
                arr[i]++;
            }
        }
        
        for(int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        
        return answer;
    }
}