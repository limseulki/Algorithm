import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        ArrayList<String> answerList = new ArrayList<>();
        
        for(String str : answer) {
            if(!str.isEmpty()) {
                answerList.add(str);
            }
        }
        
        String[] result = answerList.toArray(new String[answerList.size()]);
        
        Arrays.sort(result);
        
        return result;
    }
}