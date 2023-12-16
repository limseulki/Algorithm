class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            
            String binary1 = Integer.toBinaryString(arr1[i]);
            String binary2 = Integer.toBinaryString(arr2[i]);
            
            binary1 = "0".repeat(n - binary1.length()) + binary1;
            binary2 = "0".repeat(n - binary2.length()) + binary2;
            
            String[] arrBi1 = binary1.split("");
            String[] arrBi2 = binary2.split("");
            
            for(int j = 0; j < n; j++) {
                if(arrBi1[j].equals("1") || arrBi2[j].equals("1")) {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }   
            answer[i] = sb.toString();
        }
                
        return answer;
    }
}