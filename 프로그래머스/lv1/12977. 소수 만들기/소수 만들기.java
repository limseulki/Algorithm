class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int divisor = 0; // 약수 개수
        int sum = 0; // 숫자 3개 더한 값

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                for(int k = j + 1; k < nums.length; k++){     
                    // 숫자 3개 더하기
                    sum = nums[i] + nums[j] + nums[k];
                    
                    // 1부터 sum까지 숫자로 나눠서 나눠떨어지는 수가 몇개인지 찾기
                    for(int l = 1; l <= sum; l++){
                        if(sum % l == 0){
                            divisor += 1;
                        }
                    }
                    // 약수가 2개는 1과 자기자신이니까 소수
                    if(divisor == 2){
                        answer += 1;
                    }
                    // 약수 개수 0으로 초기화
                    divisor = 0;
                }
            }
        }
        
        return answer;
    }
}