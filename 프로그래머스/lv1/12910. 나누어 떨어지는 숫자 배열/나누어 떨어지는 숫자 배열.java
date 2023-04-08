import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        // 결과 갯수에 따라 배열의 크기가 달라야해서 List 사용
        ArrayList<Integer> arrList = new ArrayList<Integer>(); 
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0) {
                arrList.add(arr[i]);
            }
        }
        
        if(arrList.size() < 1) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[arrList.size()];
        
            for(int i = 0; i < answer.length; i++){
                answer[i] = arrList.get(i);
            }    
        }
        
        Arrays.sort(answer); // 배열 값들을 오름차순으로 정렬
        return answer;
    }
}