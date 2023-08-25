class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] str = my_string.split(" ");
        
        answer = Integer.parseInt(str[0]);
        
        for(int i = 1; i < str.length; i++) {
            if(i % 2 != 0) {
                if(str[i].equals("+")) {
                    answer += Integer.parseInt(str[i+1]);
                } else {
                    answer -= Integer.parseInt(str[i+1]);
                }
            }
        }
        
        return answer;
    }
}