import java.util.ArrayList;

class Solution {
    public String solution(String code) {
        String answer = "";
        
        String[] code_arr = new String[code.length()];
        int mode = 0;

        ArrayList<String> ret = new ArrayList<>();

        // code 분리해서 배열에 저장
        for(int i = 0; i < code.length(); i++) {
            code_arr[i] = code.substring(i, i+1);
        }

        for(int i = 0; i < code_arr.length; i++) {
            if(mode == 0) {
                if(code_arr[i].equals("1")) {
                    mode = 1;
                } else {
                    if(i % 2 == 0) {
                        ret.add(code_arr[i]);
                    }
                }
            }
            else {
                if(code_arr[i].equals("1")) {
                    mode = 0;
                } else {
                    if(i % 2 != 0) {
                        ret.add(code_arr[i]);
                    }
                }
            }
        }
        
        if(ret.isEmpty()) {
            return "EMPTY";
        }

        for(int i = 0; i < ret.size(); i++) {
            answer += ret.get(i);
        }
        
        return answer;
    }
}