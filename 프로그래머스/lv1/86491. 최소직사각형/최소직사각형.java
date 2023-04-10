import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxNum = 0;
        int minNum = 0;
        
        for(var array : sizes)
            for(var element : array)
                if(element < minNum)
                    minNum = element;
        
        // 가장 큰 수 찾기(무조건 들어감)
        // w, h중 큰 수가 가장 큰 수보다 작으면 pass, 작은 수 저장
        // 모든 배열 다 돌면서 작은 수가 더 크면 갱신
        // 갱신된 작은 수와 가장 큰 수가 가로, 세로
        
        for(var array : sizes)
            for(var element : array)
                if(element > maxNum)
                    maxNum = element;
        
        for(int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] > sizes[i][1]) {
                if(minNum < sizes[i][1]) {
                    minNum = sizes[i][1];
                }
            }
            else if(sizes[i][0] < sizes[i][1]) {
                if(minNum < sizes[i][0]) {
                    minNum = sizes[i][0];
                }
            }
            else if(sizes[i][0] == sizes[i][1]) {
                if(minNum < sizes[i][0]) {
                    minNum = sizes[i][0];
                }
            }
        }
        System.out.println(maxNum);
        System.out.println(minNum);
        answer = maxNum * minNum;
        System.out.println(answer);
        
        return answer;
    }
}