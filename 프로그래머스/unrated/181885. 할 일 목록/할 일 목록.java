class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        
        int cnt = 0;
        int false_cnt = 0;
        
        for(int i = 0; i < finished.length; i++) {
            if(finished[i] == false) {
                false_cnt++;
            }
        }
        
        String[] answer = new String[false_cnt];
        
        for(int i = 0; i < finished.length; i++) {
            if(finished[i] == false) {
                answer[cnt] = todo_list[i];
                cnt++;
            }
        }
        
        return answer;
    }
}