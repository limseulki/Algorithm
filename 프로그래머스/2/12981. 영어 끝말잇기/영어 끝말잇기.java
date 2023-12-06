import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, String[] words) {
        List<String> wordList = new ArrayList<>();
        int[] answer = new int[2];
        
        wordList.add(words[0]);
        
        for(int i = 1; i < words.length; i++) {
            if(words[i-1].substring(words[i-1].length()-1, words[i-1].length()).equals(words[i].substring(0, 1))) {
                if(!wordList.contains(words[i])) {
                    wordList.add(words[i]);
                } else {
                    answer[0] = (i % n) + 1;
                    answer[1] = i / n + 1;
                    break;
                }
            } else {
                answer[0] = (i % n) + 1;
                answer[1] = i / n + 1;
                break;
            }
        }

        return answer;
    }
}