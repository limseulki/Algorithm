class Solution {
    
    boolean isPrime(int num) {
        int end = (int)Math.sqrt(num);
        
        for(int i = 2; i <= end; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 2; i <= n; i++) {
            if(isPrime(i)) {
                answer++;
            }
        }
        
        return answer;
    }
}