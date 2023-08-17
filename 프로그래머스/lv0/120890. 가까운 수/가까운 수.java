import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int num = 0;
        int min = n+100;
        
        Arrays.sort(array);
        
        for(int i = 0; i < array.length; i++) {
            num = Math.abs(array[i] - n);
            
            if(num < min) {
                min = num;
                answer = array[i];
            }
        }
        
        return answer;
    }
}