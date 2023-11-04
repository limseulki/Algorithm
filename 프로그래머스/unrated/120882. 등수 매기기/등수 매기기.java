class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        float[] avg = new float[score.length];
        
        for(int i = 0; i < score.length; i++) {
            avg[i] = (float)((score[i][0] + score[i][1]) / 2.0);
        }
        
        for(int i = 0; i < avg.length; i++) {
            int order = 1;
            for(int j = 0; j < score.length; j++) {
                if(avg[i] < avg[j]) {
                    order++;
                }
                answer[i] = order;
            }
        }
        
        return answer;
    }
}