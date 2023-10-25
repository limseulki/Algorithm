class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] arr = my_string.toCharArray();
        String answer = "";
        
        for(int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            
            for(int j = s; j <= (s+e)/2; j++) {
                char tmp = arr[j];
                arr[j] = arr[s+e-j];
                arr[s+e-j] = tmp;
            }
        }
        
        for(int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        
        return answer;
    }
}