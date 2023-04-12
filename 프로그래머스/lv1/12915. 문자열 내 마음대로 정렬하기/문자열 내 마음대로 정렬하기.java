import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> nString = new ArrayList<>();
        
        // 각 문자에서 charAt으로 n번째 글자를 가져와 문자 앞에 붙여 list에 추가한다.
        for(int i = 0; i < strings.length; i++) {
            nString.add(strings[i].charAt(n) + strings[i]);
        }
        
        // 문자를 오름차순으로 정렬하면 n번째 글자 기준으로 정렬이 된다.
        Collections.sort(nString);
        
        // 문자 길이만큼 answer 배열 크기 할당하고
        answer = new String[nString.size()];
        
        // nString에서 맨 앞에 붙여준 글자 말고 두번째 글자부터 끝까지 잘라내 answer에 저장한다.
        for(int i = 0; i < nString.size(); i++) {
            answer[i] = nString.get(i).substring(1, nString.get(i).length());
        } 
        
        return answer;
    }
}