import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < arr.length - 1; i++){
            // 값이 변하는 순간이 나오면 앞순서 숫자를 list에 넣는다.
            if(arr[i] != arr[i+1]) {
                list.add(arr[i]);
            }
            // 마지막 값은 변하는 순간이 나오지 않으니까 list에 없다.
            // 그래서 마지막 값은 그냥 list에 넣어주면 된다.
            if(i == arr.length - 2) {
                list.add(arr[arr.length - 1]);
            }
        }
        
        // list 사이즈만큼 answer배열을 할당하고, 값을 옮겨담는다.
        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}