class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        int c = gcd(a,b);
        
        a = a / c;
        b = b / c;
        
        if(a % b == 0) {
            answer = 1;
        }
        
        for(int i = 2; i <= b; i++) {
            if(answer != 2) {
                while(b % i == 0) {
                    if(i == 2 || i == 5) {
                        answer = 1;
                    } else {
                        answer = 2;
                        break;
                    }
                    b /= i;
                }
            }
        }
        
        return answer;
    }
    
    public static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
}