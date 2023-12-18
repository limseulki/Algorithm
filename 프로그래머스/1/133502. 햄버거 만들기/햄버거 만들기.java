import java.util.Stack;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        Stack<Integer> hambergerStack = new Stack<Integer>();
        
        for(int i = 0; i < ingredient.length; i++) {
            hambergerStack.push(ingredient[i]);
            
            if(hambergerStack.size() >= 4) {
                if(hambergerStack.get(hambergerStack.size()-4) == 1 && 
                  hambergerStack.get(hambergerStack.size()-3) == 2 &&
                  hambergerStack.get(hambergerStack.size()-2) == 3 &&
                  hambergerStack.get(hambergerStack.size()-1) == 1) {
                    
                    for(int j = 0; j < 4; j++) {
                        hambergerStack.pop();
                    }
                    
                    answer++;
                }
            }
        }
        
        return answer;
    }
}