import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int minNum = 0;
        int[] newArr = arr.clone(); // 가장 작은 수 찾기 위한 배열 복사
        ArrayList<Integer> list = new ArrayList<Integer> ();
        
        if(arr.length == 1) { // arr 배열 길이가 1이면 -1 리턴
            answer = new int[1]; // answer 크기 1로 초기화
            answer[0] = -1; // answer에 -1 저장
        }
        else {
            Arrays.sort(newArr); // 배열 복사해서 오름차순 정렬
            minNum = newArr[0]; // 정렬 후 0번째 값이 가장 작은 값
            int arrLength = arr.length; // 배열 길이에 변화를 주며 최소값을 찾기위해 선언
            
            for(int i = 0; i < arr.length; i++) { // 원래 배열에 가장 작은 값이 또 있는지 비교
                if(arr[i] == minNum) { // 원래 배열의 i번째 값과 가장 작은 값이 같으면
                    arrLength--; // 배열 길이 하나 줄이기
                    continue; // 다음 문장인 list에 값 저장은 건너뛰고, 다음 i로 함수 진행
                }
                list.add(arr[i]); // list에 i번째 arr값 저장
            }
            answer = new int[arrLength]; // 가장 작은 값 제외한 배열 길이만큼 answer 초기화
            for(int i = 0; i < arrLength; i++) { // answer에 list에 저장된 값 저장하기
                answer[i] = list.get(i);
            }   
        }   
        return answer;
    }
}