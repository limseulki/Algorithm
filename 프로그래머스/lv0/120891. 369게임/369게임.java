class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String[] order_str = Integer.toString(order).split("");
        
        for(int i = 0; i < order_str.length; i++) {
            if(order_str[i].equals("3") || order_str[i].equals("6") || order_str[i].equals("9")) {
                answer++;
            }
        }
        
        return answer;
    }
}