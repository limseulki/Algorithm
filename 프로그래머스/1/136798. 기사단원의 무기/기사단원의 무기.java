class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int count = 0;
        int test = 0;
        for(int i = 1; i < number+1; i++){
            count = 1;
            test = i / 2;
            for(int j = 1; j < test+1; j++){
                if(i % j == 0){
                    count++;
                }
                if(count > limit){
                    count = power;
                    break;
                }
            }
            answer += count;
        }
        return answer;
    }
}