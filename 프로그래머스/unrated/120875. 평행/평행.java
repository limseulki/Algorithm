class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        double[][] slope = new double[4][4];
        
        for(int i = 0; i < dots.length; i++) {
            for(int j = 0; j < dots.length; j++) {
                if (i == j){
                    continue;
                }                    

                double y = dots[i][1] - dots[j][1];
                double x = dots[i][0] - dots[j][0];
                slope[i][j] = y / x;
            }
        }
        
        for(int i = 0 ; i < slope.length ; i++) {
            for(int j = 0 ; j < 4 ; j++) {
                if(i == j) {
                    continue;
                }
                
                for(int k = 0 ; k < 4 ; k++) {
                    for(int l = 0 ; l < 4 ; l++) {
                        if(k == l) {
                            continue;
                        }

                        if(i == k || i == l || j == k || j == l) {
                            continue;
                            
                        }

                        if(slope[i][j] == slope[k][l]) {
                            answer = 1;
                        }                            
                    }
                }
            }
        }
        
        return answer;
    }
}