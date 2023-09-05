class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        String[] str = new String[array.length];
        String str_n = String.valueOf(n);
        
        for(int i = 0; i < array.length; i++) {
            str[i] = String.valueOf(array[i]);
            if(str[i].equals(str_n)) {
                answer++;
            }
        }
        
        return answer;
    }
}