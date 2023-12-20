class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        
        int[] intX = new int[10];
        int[] intY = new int[10];
        
        for(String x : X.split("")) {
            int i = Integer.parseInt(x);
            intX[i]++;
        }
        
        for(String y : Y.split("")) {
            int i = Integer.parseInt(y);
            intY[i]++;
        }
        
        int[] arr = new int[10];
        
        for(int i = 0; i < 10; i++) {
            if(intX[i] >= intY[i]) {
                arr[i] = intY[i];
            } else {
                arr[i] = intX[i];
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 9; i >= 0; i--) {
            for(int j = 0; j < arr[i]; j++) {
                sb.append(i);
            }
        }
        
        answer = sb.toString();
        
        if(answer.equals("")) {
            answer = "-1";
        } else if(answer.replace("0", "") == "") {
            answer = "0";
        }
        
        return answer;
    }
}