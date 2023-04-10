import java.util.*; 

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        // remove 속도 효율성을 높이기 위해 ArrayList가 아닌 LinkedList를 사용
        LinkedList<String> retire = new LinkedList<>(Arrays.asList(participant));
        
        retire.sort(Comparator.naturalOrder());
        Arrays.sort(completion);
        
        for (int i = 0; i < completion.length; i++) {
            if (retire.get(0).equals(completion[i])) {
                retire.remove(0);
            }
            else if (retire.get(1).equals(completion[i])) {
                retire.remove(1);
            }
        }
        answer = retire.get(0);
        return answer;
    }
}