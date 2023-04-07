class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] day = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sumday = 0;
        
        for(int i = 0; i < (a-1); i++){
            sumday += day[i];
        } 
        
        sumday += b;
        
        switch(sumday % 7){
          case 0:
              return "THU";
          case 1:
              return "FRI";
          case 2:
              return "SAT";
          case 3:
              return "SUN";
          case 4:
              return "MON";
          case 5:
              return "TUE";
          case 6:
              return "WED";
        }
        return null;
    }
}