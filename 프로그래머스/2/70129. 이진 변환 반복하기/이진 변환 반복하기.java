class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        String binaryString = s;
        int cnt = 0;
        int zeroCount = 0;
        
        while(!binaryString.equals("1")) {
            int len = binaryString.length();
            String newS = binaryString.replace("0", "");
            int newLen = newS.length();
            zeroCount += len - newLen;

            binaryString = Integer.toBinaryString(newLen);
            cnt++;
        }
        
        answer[0] = cnt;
        answer[1] = zeroCount;
        
        return answer;
    }
}