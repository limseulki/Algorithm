import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] word = s.split(""); // 문자열을 글자 하나씩 word 배열에 저장
        int index = 0; // 인덱스 초기화
        
        for(int i = 0; i < word.length; i++) {
            if(word[i].equals(" ")) { // 공백 만나면 인덱스 초기화
                index = 0;
            }
            else if(index % 2 == 0) { // 인덱스가 짝수이면 그 글자 대문자로, 인덱스 1 증가
                word[i] = word[i].toUpperCase(); 
                index ++;
            }
            else if(index % 2 != 0) { // 인덱스가 홀수이면 그 글자 소문자로, 인덱스 1 증가
                word[i] = word[i].toLowerCase();
                index ++;
            }
            answer += word[i]; // 변환된 글자들 answer에 저장
        }
        return answer;
    }
}