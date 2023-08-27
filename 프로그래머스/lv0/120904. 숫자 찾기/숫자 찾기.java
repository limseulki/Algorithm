class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String nums = String.valueOf(num);
        
        for(int i = 0; i < nums.length(); i++) {
            if(nums.charAt(i)== k+'0') {
                answer = i + 1;
                break;
            } else {
                answer = -1;
            }
        }
        
        
        return answer;
    }
}