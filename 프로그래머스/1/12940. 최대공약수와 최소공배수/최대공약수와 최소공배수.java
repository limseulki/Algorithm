class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        answer[0] = gcd(n, m);
        answer[1] = lcm(n, m);
        
        return answer;
    }
    
    public static int gcd(int a, int b) {
        if(b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
    
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}