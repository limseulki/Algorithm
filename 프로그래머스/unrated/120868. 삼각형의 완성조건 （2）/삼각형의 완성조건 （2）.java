import java.lang.Math;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        int min = Math.abs(sides[0] - sides[1]) + 1;
        int max = sides[0] + sides[1] - 1;
        
        answer = max - min + 1;
        
        return answer;
    }
}