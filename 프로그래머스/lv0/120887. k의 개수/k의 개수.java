class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int n = i; n <= j; n++) {
            String[] ch = Integer.toString(n).split("");
            for(int c = 0; c < ch.length; c++) {
                if(ch[c].contains(Integer.toString(k))) {
                    answer++;
                }
            }
            
        }
        
        return answer;
    }
}