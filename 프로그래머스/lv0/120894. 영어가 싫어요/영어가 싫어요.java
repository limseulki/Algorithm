class Solution {
    
    public static String[] NUM_STRING = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public static String[] NUM_CHAR = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    
    public long solution(String numbers) {
        long answer = 0;
        
        for(int i = 0; i < 10; i++) {
            numbers = numbers.replace(NUM_STRING[i], NUM_CHAR[i]);
        }
        
        answer = Long.valueOf(numbers);
        
        return answer;
    }
}