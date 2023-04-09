class Solution {
    public long solution(long n) {
        long answer = 0;
        /*
        for(int i=1;i*i<=n;i++){
            if(i*i==n){
                answer = (i+1)*(i+1);
            }
        }
        
        if (answer==0){
            answer = -1;
        }
        */
        
        double d = Math.sqrt(n);
        answer = (long)Math.sqrt(n);
        
        if(d-answer==0){
            answer = (answer+1)*(answer+1);
        }
        else if(d-answer>0){
            answer = -1;
        }
        return answer;
    }
}