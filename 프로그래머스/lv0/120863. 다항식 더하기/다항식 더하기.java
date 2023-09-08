class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int num1 = 0;
        int num2 = 0;

        String[] str = polynomial.split(" ");

        for(int i = 0; i < str.length; i++) {
            if(!str[i].equals("+")) {
                if (str[i].contains("x")) {
                    if (str[i].length() == 1) {
                        num1 += 1;
                    } else {
                        String s = str[i].replace("x", "");
                        num1 += Integer.parseInt(s);
                    }
                } else {
                    num2 += Integer.parseInt(str[i]);
                }
            }
        }

        if(num1 != 0) {
            if(num2 != 0) {
                if(num1 == 1) {
                    answer = "x + " + num2;
                } else {
                    answer = num1 + "x + " + num2;
                }
            } else {
                if(num1 == 1) {
                    answer = "x";
                } else {
                    answer = num1 + "x";
                }
            }
        } else {
            answer = num2 + "";
        }
        
        return answer;
    }
}