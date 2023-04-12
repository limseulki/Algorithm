import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";

        // s를 한 글자씩 나눈다
        String[] array = s.split("");
        
        // 알파벳 순(오름차순)으로 정렬한다.
        // *** 사전 순서에서 모든 대문자가 소문자보다 먼저 온다.
        Arrays.sort(array);
        
        // 순서를 뒤집는다.
        Collections.reverse(Arrays.asList(array));
        
        // answer에 값 넣어주기
        for(String a : array)
            answer += a;
        
        return answer;
    }
}