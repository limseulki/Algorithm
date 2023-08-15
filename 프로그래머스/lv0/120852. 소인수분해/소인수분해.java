import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> newList = new ArrayList<>();
        
        for(int i = 2; i <= Math.sqrt(n); i++) {
            while(n % i == 0) {
                list.add(i);
                n /= i;
            }
        }
        
        if(n != 1) {
            list.add(n);
        }
        
        for(int i = 0; i < list.size(); i++) {
            if(!newList.contains(list.get(i))) {
                newList.add(list.get(i));
            }
        }
        
        int[] answer = new int[newList.size()];
        
        for(int i = 0; i < newList.size(); i++) {
            answer[i] = newList.get(i);
        }
        
        return answer;
    }
}