class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int tmp = 0;
        
        char[] ch = new char[my_string.length()];
        
        for(int i = 0; i < my_string.length(); i++) {
            ch[i] = my_string.charAt(i);
        }
        
        for(int i = 0; i < ch.length; i++){
            if(Character.isDigit(ch[i])) {
                tmp = tmp * 10 + Character.getNumericValue(ch[i]);
                if(i == ch.length-1) {
                    answer += tmp;
                }
            } else {
                answer += tmp;
                tmp = 0;
            }
        }
        
        return answer;
    }
}