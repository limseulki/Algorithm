class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int serviceChicken = chicken;
        int coupon = 0;
        
        
        while(serviceChicken >= 10){
            coupon += serviceChicken % 10;
            serviceChicken /= 10;
            coupon++;
            
            if(coupon >= 10) {
                coupon += coupon % 10;
                coupon /= 10;
                answer += coupon;
                coupon++;                
            }
            
            answer += serviceChicken;
        }
        
        
        return answer;
    }
}