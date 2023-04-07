class Solution {
    public int solution(int num) {
        int count = 0;
        int result = num;
        
        while(true){
            if(count == 500 || result == 1){
                break;
            }
            if(result % 2 == 0){
                result /= 2;
            }
            else if(result % 2 == 1){
                result = result * 3 + 1;
            }
            count++;
        }
        if(count == 500){
            return -1;
        }
        return count;
    }
}