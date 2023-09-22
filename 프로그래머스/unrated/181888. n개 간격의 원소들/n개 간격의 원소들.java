import java.lang.Math;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[(int)Math.ceil((double)num_list.length/n)];
        int cnt = 0;
        
        for(int i = 0; i < num_list.length; i+=n) {
            answer[cnt] = num_list[i];
            cnt++;
        }
        
        return answer;
    }
}