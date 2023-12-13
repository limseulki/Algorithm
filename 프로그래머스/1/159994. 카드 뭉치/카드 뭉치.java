class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        
        int j = 0;
        int k = 0;
        
        for(int i = 0; i < goal.length; i++) {
            if(cards1.length > j && goal[i].equals(cards1[j])) {
                j++;
            } else if(cards2.length > k && goal[i].equals(cards2[k])) {
                k++;
            }
        }
        
        if(j + k < goal.length) {
            answer = "No";
        } else {
            answer = "Yes";
        }
        
        return answer;
    }
}