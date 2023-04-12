import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        int[] score = {0,0,0};
        int max = 0;
        int count = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        // 정답과 수포자가 찍은 정답이 같으면 score(정답수) 증가
        for(int i = 0; i < answers.length; i++) {
            if(one[i % 5] == answers[i])
                score[0] ++;
            if(two[i % 8] == answers[i])
                score[1] ++;
            if(three[i % 10] == answers[i])
                score[2] ++;
        }
        
        // 최대 정답수 찾기
        for(int i = 0; i < score.length; i++) {
            if(max < score[i]) {
                max = score[i];
            }
        }
        
        // 최대 정답자 수만큼 answer 배열 크기 할당하기 위한 반복문
        for(int i = 0; i < score.length; i++) {
            if(max == score[i]) {
                count++;
            }
        }
        
        // 최대 정답자 수만큼 answer 배열 초기화
        answer = new int[count];
        
        // 최고 정답자 answer 배열에 넣기
        for(int i = 0; i < score.length; i++) {
            if(max == score[i]) {
                list.add(i+1); // answer 인덱스 주는 게 번거로워서 list로 받아서 값 넘겨주기로 함
            }
        }
        
        // list에서 answer로 값 전달하기
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}