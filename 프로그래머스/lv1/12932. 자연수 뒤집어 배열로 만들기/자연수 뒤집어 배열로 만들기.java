class Solution {
    public int[] solution(long n) {
        int length = (int)(Math.log10(n)+1); // n의 자릿수만큼 배열을 할당하기 위해 자릿수 구하고, int형으로 형변환
        int[] answer = new int[length]; // n의 자릿수만큼 배열 할당
        String stringNum = Long.toString(n); // 각 자릿수로 나누기 위해 문자열로 변환
    
        String[] splitNum = stringNum.split(""); // 각 자릿수로 나눠 배열에 저장
        for(int i = 0; i < splitNum.length; i++) { // 배열 길이만큼 반복하며 마지막 숫자부터 answer 배열에 저장
            answer[i] += Integer.parseInt(splitNum[splitNum.length-i-1]);
            System.out.println(answer[i]);
        }
        return answer;
    }
}