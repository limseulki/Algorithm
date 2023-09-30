import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        char[] arr1 = before.toCharArray();
        char[] arr2 = after.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        String str1 = new String(arr1);
        String str2 = new String(arr2);
        
        if(str1.equals(str2)) {
            answer = 1;
        } else {
            answer = 0;
        }
           
        return answer;
    }
}