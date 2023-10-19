import java.util.ArrayList;

class Solution {
    public String[] solution(String myStr) {        
        String[] words = myStr.split("a|b|c");
        ArrayList<String> result = new ArrayList<>();
        
        if(words.length == 0) {
            result.add("EMPTY");
        }
                
        for(String str : words) {
            if(str.length() > 0) {
                result.add(str);
            }
        }
        
        String[] answer = new String[result.size()];
        
        for(int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}