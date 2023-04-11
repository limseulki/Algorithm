import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        ArrayList<Integer> sumNum = new ArrayList<Integer>();
        int sum;
        
        // 두 수를 뽑아 더한 값을 list에 옮겨 저장한다.
        // 이미 있는 값이라면 저장하지 않는다.
        // list를 오름차순으로 정렬하고 answer에 옮긴다.
        
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < i; j++) {
                sum = numbers[i] + numbers[j];
                // 두 수의 합이 이미 리스트에 있으면 넣지 않고, 없으면 넣는다
                if(sumNum.contains(sum) == false) {
                    sumNum.add(sum);
                }
            }
        }
        // Integer list 오름차순 정렬
        Collections.sort(sumNum);
        
        // answer배열 크기 설정
        answer = new int[sumNum.size()];
        
        // answer 배열에 sumNum리스트에서 값 가져와 넣기
        for(int i = 0; i < sumNum.size(); i++) {
            answer[i] = sumNum.get(i);
        }
        
        return answer;
    }
}