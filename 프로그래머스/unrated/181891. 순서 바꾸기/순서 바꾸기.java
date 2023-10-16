class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int ind = 0;
        
        for(int i = n; i < num_list.length; i++) {
            answer[ind] = num_list[i];
            ind++;
        }
        
        for(int i = 0; i < n; i++) {
            answer[ind] = num_list[i];
            ind++;
        }
        
        return answer;
    }
}