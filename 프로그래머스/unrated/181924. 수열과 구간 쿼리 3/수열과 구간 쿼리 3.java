class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        int tmp = 0;
        
        for(int[] query : queries) {
            int i = query[0];
            int j = query[1];
            
            tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        answer = arr;
        return answer;
    }
}