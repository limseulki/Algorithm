import java.util.ArrayList;

class Solution {
    public String[] solution(String[] str_list) {
        ArrayList<String> str = new ArrayList<>();
        
        for(int i = 0; i < str_list.length; i++) {
            if(str_list[i].equals("l")) {
                for(int j = 0; j < i; j++) {
                    str.add(str_list[j]);
                }
                break;
            }
            if(str_list[i].equals("r")) {
                for(int j = i+1; j < str_list.length; j++) {
                    str.add(str_list[j]);
                }
                break;
            }
        }
                
        String[] answer = new String[str.size()];
        
        for(int i = 0; i < str.size(); i++) {
            answer[i] = str.get(i);
        }
        
        return answer;
    }
}