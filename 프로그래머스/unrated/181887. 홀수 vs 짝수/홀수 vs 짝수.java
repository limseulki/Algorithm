class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum1 = 0;
        int sum2 = 0;
        
        for(int i = 0; i < num_list.length; i++) {
            if(i % 2 == 0) {
                sum1 += num_list[i];
            } else {
                sum2 += num_list[i];
            }
        }
        
        if(sum1 < sum2) {
            answer = sum2;
        } else {
            answer = sum1;
        }
        
        return answer;
    }
}