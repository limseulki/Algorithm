import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int firstIndex = -1;
        int lastIndex = -1;
        
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 2) {
                firstIndex = i;
                break;
            }
        }
        
        if(firstIndex != -1) {
            for(int i = firstIndex; i < arr.length; i++) {
                if(arr[i] == 2) {
                    lastIndex = i;
                }
            }
        }
        
        if(firstIndex == -1) {
            result.add(-1);
        } else if(firstIndex == lastIndex) {
            result.add(2);
        } else {
            for(int i = firstIndex; i <= lastIndex; i++) {
                result.add(arr[i]);
            }
        }
        
        int[] answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}