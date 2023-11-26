class Solution {
    public int solution(int n) {
        int answer = 0;
        int oneCount = Integer.bitCount(n);

        while(true) {
            n++;
            int newCount = Integer.bitCount(n);

            if(newCount == oneCount) {
                answer = n;
                break;
            }
        }
        
        return answer;
    }
}