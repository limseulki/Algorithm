class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] split_letter = letter.split(" ");
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        for(int i = 0; i < split_letter.length; i++) {
            for(int j = 0; j < morse.length; j++) {
                if(split_letter[i].equals(morse[j])) {
                    answer += (char)('a'+j);
                }
            }
        }
        
        return answer;
    }
}