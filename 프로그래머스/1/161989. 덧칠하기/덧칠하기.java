class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        int start = section[0];
        answer++;
        
        for(int i = 0; i < section.length; i++) {     
            if(start + m > section[i]) {
                continue;
            }
            
            start = section[i];
            answer++;
        }
        
        return answer;
    }
}