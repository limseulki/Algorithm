class Solution {
    public int solution(String s) {
        int answer = 0;
        char x = s.charAt(0);
        int xCount = 1;
        int otherCount = 0;

        for(int i = 1; i < s.length(); i++) {
            if(x == 'X') {
                xCount = 1;
                otherCount = 0;
                x = s.charAt(i);
                continue;
            }
            if(x == s.charAt(i)) {
                xCount++;
            } else {
                otherCount++;
            }
            if(xCount == otherCount) {
                answer++;
                x = 'X';
            }
        }
        
        if(x != 'X') {
            answer++;
        }
        
        return answer;
    }
}