import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stkArr = new ArrayList<>();
        
        int i = 0;
        while(i < arr.length) {
            if(stkArr.size() == 0) {
                stkArr.add(arr[i]);
                i++;
            }
            else if(stkArr.get(stkArr.size()-1) < arr[i]) {
                stkArr.add(arr[i]);
                i++;
            }
            else if(stkArr.get(stkArr.size()-1) >= arr[i]) {
                stkArr.remove(stkArr.size()-1);
            }
        }
        
        int[] stk = new int[stkArr.size()];
        
        for(int j = 0; j < stkArr.size(); j++) {
            stk[j] = stkArr.get(j);
        }
        
        return stk;
    }
}