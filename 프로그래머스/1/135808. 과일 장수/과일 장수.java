import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        // 내림차순 정렬을 위한 Integer 사용
        Integer[] arr = new Integer[score.length];
        
        for(int i = 0; i < score.length; i++) {
            arr[i] = new Integer(score[i]);
        }
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        for(int i = m - 1; i < arr.length; i += m) {
            answer += (arr[i] * m);
        }
        
        return answer;
    }
}