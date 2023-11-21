import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> newPicture = new ArrayList<>();
        
        for(int i = 0; i < picture.length; i++) {
            StringBuilder newRow = new StringBuilder();
            
            for(char pixel : picture[i].toCharArray()) {
                for(int j = 0; j < k; ++j) {
                    newRow.append(pixel);
                }
            }
            
            for(int j = 0; j < k; ++j) {
                newPicture.add(newRow.toString());
            }
        }
        
        String[] answer = new String[newPicture.size()];
        answer = newPicture.toArray(answer);
        
        return answer;
    }
}