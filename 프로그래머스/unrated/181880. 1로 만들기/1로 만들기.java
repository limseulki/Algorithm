class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        for(int i = 0; i < num_list.length; i++) {
            int num = num_list[i];
            int cnt = 0;
            
            while(num != 1) {
                if(num % 2 == 0) {
                    num /= 2;
                    cnt++;
                } else {
                    num = (num - 1) / 2;
                    cnt++;
                }
            }
            answer += cnt;
        }
        
        return answer;
    }
}