class Solution {
    public String solution(String s) {
        String[] splitS = s.split(" ", -1);
        StringBuilder sb = new StringBuilder();
        String answer = "";
        
        for(int i = 0; i < splitS.length; i++) {
            if(splitS[i].length() > 1) {
                sb.append(splitS[i].substring(0,1).toUpperCase() + 
                splitS[i].substring(1,splitS[i].length()).toLowerCase());
            } else if(splitS[i].length() == 1) {
                sb.append(splitS[i].substring(0,1).toUpperCase());
            }

            if(!(i == splitS.length - 1)) {
                sb.append(" ");
            }
        }
        
        answer = sb.toString();
        
        return answer;
    }
}