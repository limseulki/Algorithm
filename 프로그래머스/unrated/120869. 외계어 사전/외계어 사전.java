class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        
        for(int i = 0; i < dic.length; i++) {
            int count = 0;
            
            for(int j = 0; j < spell.length; j++) {
                if(dic[i].indexOf(spell[j]) == -1) {
                    count = 1;
                    answer = 2;
                }
            }
            
            if(count == 0) {
                answer = 1;
                break;
            }
        }
        
        return answer;
    }
}