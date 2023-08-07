class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(n % 6 == 0) {
            answer = n / 6;
        } else {
            int gcd = gcd(n, 6);
            int pizzas = n * 6 / gcd;
            answer = pizzas / 6;
        }
        
        return answer;
    }
    
    public int gcd(int a, int b) {
        while(b != 0) {
            int c = a % b;
            
            a = b;
            b = c;
        }
        return a;
    }
}