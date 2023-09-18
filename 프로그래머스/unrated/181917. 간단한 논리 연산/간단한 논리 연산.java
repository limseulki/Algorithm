class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true; 
        
        boolean x = or(x1, x2);
        boolean y = or(x3, x4);
        
        if(x == true && y == true) {
            answer = true;
        } else {
            answer = false;
        }
        
        return answer;
    }
    
    public boolean or(boolean x, boolean y) {
        if(x == y) {
            return x;
        } else {
            return true;
        }
    }
}