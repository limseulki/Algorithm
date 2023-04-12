import java.util.*;

class Solution {
    // 최저 순위는 현재 lottos 그대로 순위를 매기면 되고
    // 최고 순위는 0을 당첨된 숫자라고 판단하고 순위를 매기면 됨
    // 두 배열에서 같은 값이 있으면 카운트 올려주기
    // 최종 카운트가 최저순위
    // lottos 배열에서 0을 찾아 unrecognizedNum 올려주기
    // 카운트와 unrecognizedNum 더해서 최고순위
    
    // 로또 순위 정하는 메소드
    public static int ranking(int rankCnt) {
        int rank = 0;
            switch(rankCnt) {
                case 0 :
                    rank = 6;
                    break;
                case 1 :
                    rank = 6;
                    break;
                case 2 :
                    rank = 5;
                    break;
                case 3 :
                    rank = 4;
                    break;
                case 4 :
                    rank = 3;
                    break;
                case 5 :
                    rank = 2;
                    break;
                case 6 :
                    rank = 1;
                    break;
            }
            return rank;
        }
    
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int unrecognizedNum = 0;
        int count = 0;
        int rankCnt = 0;
        int minRank = 0;
        int maxRank = 0;
        
        // lottos에서 win_nums와 같은 값 있는지 찾기
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 6; j++) {
                if(lottos[i] == win_nums[j])
                    count++;
            }
        }
        // 최저 순위 정하기
        minRank = ranking(count);

        // lottos에서 0 개수 찾기
        for(int i = 0; i < 6; i++) {
            if(lottos[i] == 0) {
                unrecognizedNum ++;
            }
        }
        // 최고 순위 정하기
        maxRank = ranking(count + unrecognizedNum);

        answer[0] = maxRank;
        answer[1] = minRank;

        return answer;
    }
}