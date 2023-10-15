import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int num : arr) {
            result.add(num);
        }
        
        for(int nums : delete_list){
            int index = result.indexOf(nums);
            
            if (index != -1) {
                result.remove(index);
            }
        }
        
        int[] answer = new int[result.size()];
        
        for(int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}