class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 3진법으로 변경 -> toString(10진수, n) 사용
        String ternary = Integer.toString(n, 3);
        
        // 순서 뒤집기 -> 마지막 값부터 새로운 문자열에 저장
        String reverse = "";
        for(int i = ternary.length() - 1; i >= 0; i--) {
            reverse = reverse + ternary.charAt(i);
        }
        
        // 10진법으로 변경 -> parseInt(n진수, n) 사용
        answer = Integer.parseInt(reverse, 3);
        System.out.print(answer);
        
        return answer;
    }
}