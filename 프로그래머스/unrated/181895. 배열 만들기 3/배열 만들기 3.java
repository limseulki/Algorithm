import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> nums = new ArrayList<>();
        int a = -1;
        int b = -1;
        
        for(int i = 0; i < intervals.length; i++) {
            a = intervals[i][0];
            b = intervals[i][1];
            
            for(int j = a; j <= b; j++) {
                nums.add(arr[j]);
            }
        }
        
        int[] answer = new int[nums.size()];
        
        for(int i = 0; i < nums.size(); i++) {
            answer[i] = nums.get(i);
        }
        
        return answer;
    }
}