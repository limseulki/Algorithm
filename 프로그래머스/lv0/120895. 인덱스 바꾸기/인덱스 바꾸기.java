class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        char[] array_ch = my_string.toCharArray();
        
        array_ch[num1] = my_string.charAt(num2);
        array_ch[num2] = my_string.charAt(num1);
        
        answer = String.valueOf(array_ch);
        
        return answer;
    }
}