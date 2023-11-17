import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < arr.length; i++) {
            if(!queue.contains(arr[i])) {
                queue.add(arr[i]);
            }
            if(queue.size() == k) {
                break;
            }
        }
        
        if(queue.size() < k) {
            while(true) {
                queue.add(-1);
                
                if(queue.size() == k) {
                    break;
                }
            }
        }

        for(int i = 0; i < answer.length; i++) {
            answer[i] = queue.poll();
        }
        
        return answer;
    }
}