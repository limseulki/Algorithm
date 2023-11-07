class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int tmp;
        int num1, num2;
        
        for(int i = 0; i < numlist.length - 1; i++) {
            for(int j = 0; j < numlist.length - 1; j++) {
                num1 = Math.abs(numlist[j] - n);
                num2 = Math.abs(numlist[j + 1] - n);
                
                if(num1 > num2 | (num1 == num2 && numlist[j] < numlist[j + 1])) {
                    tmp = numlist[j];
                    numlist[j] = numlist[j + 1];
                    numlist[j + 1] = tmp;
                }
            }
        }
        
        for(int i = 0; i < numlist.length; i++) {
            answer[i] = numlist[i];
        }
        
        return answer;
    }
}