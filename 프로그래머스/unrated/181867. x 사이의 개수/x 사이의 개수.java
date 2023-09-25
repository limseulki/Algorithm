class Solution {
    public int[] solution(String myString) {
        
        String[] splitString = myString.split("x", -1);
        int[] answer = new int[splitString.length];
        
        for(int i = 0; i < splitString.length; i++) {
            answer[i] = splitString[i].length();
        }
        
        return answer;
    }
}