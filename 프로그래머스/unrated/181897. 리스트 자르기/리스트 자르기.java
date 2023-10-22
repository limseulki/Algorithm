import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        ArrayList<Integer> nums = new ArrayList<>();
        
        switch(n) {
            case 1:
                for(int i = 0; i <= slicer[1]; i++) {
                    nums.add(num_list[i]);
                }
                break;
            case 2:
                for(int i = slicer[0]; i < num_list.length; i++) {
                    nums.add(num_list[i]);
                }
                break;
            case 3:
                for(int i = slicer[0]; i <= slicer[1]; i++) {
                    nums.add(num_list[i]);
                }
                break;
            case 4:
                for(int i = slicer[0]; i <= slicer[1]; i+=slicer[2]) {
                    nums.add(num_list[i]);
                }
                break;
                
        }
        
        int[] answer = new int[nums.size()];
        
        for(int i = 0; i < nums.size(); i++) {
            answer[i] = nums.get(i);
        }
        
        return answer;
    }
}