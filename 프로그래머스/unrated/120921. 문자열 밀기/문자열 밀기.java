class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        int cnt = 0;

        if (!A.equals(B)) {

            String originA = A;

            while (true) {
                cnt++;
                int len = A.length() - 1;
                String last = String.valueOf(A.charAt(len));

                for(int i = 0; i < len; i++) {
                    last += A.charAt(i);
                }

                if(last.equals(B)) {
                    answer = cnt;
                    break;
                } else if(last.equals(originA)) {
                    answer = -1;
                    break;
                }
                
                A = last;
            }
        }
        
        return answer;
    }
}