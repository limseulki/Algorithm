class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for(int i = 0; i < my_string.length(); i++) {
            int index = (int) my_string.charAt(i);
            if(index >= 65 && index <= 90) {
                answer[index-65]++;
            } else if(index >= 97 && index <= 122) {
                answer[index-71]++;
            }
        }
        
        return answer;
    }
}