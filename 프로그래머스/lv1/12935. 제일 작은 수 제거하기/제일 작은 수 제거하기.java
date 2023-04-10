import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int min = 0;
        int[] copy = arr.clone();
        ArrayList<Integer> list = new ArrayList<Integer>();

        if(arr.length == 1) {
            answer = new int[1];
            answer[0] = -1;
        }
        else {
            answer = new int[arr.length];
            Arrays.sort(copy);
            min = copy[0];
            int k = arr.length;

            for(int i=0; i<arr.length; i++){
                if(arr[i] == min){
                    k--;
                    continue;
                }
                list.add(arr[i]);
            }

            answer = new int[k];

            for(int i=0; i<k; i++){
                answer[i] = list.get(i);
            }

        }

        return answer;
    }
}

// import java.util.*;

// class Solution {
//     public int[] solution(int[] arr) {
//         int[] answer = {};
//         int[] newArr = arr.clone();
//         ArrayList<Integer> list = new ArrayList<Integer> ();
        
//         if(arr.length == 1) {
//             answer = new int[1];
//             answer[0] = -1;
//         }
//         else {
//             answer = new int[arr.length];
//             Arrays.sort(newArr);
//             int arrLength = arr.length;
            
//             for(int i = 0; i < arrLength; i++) {
//                 if(arr[i] == newArr[0]) {
//                     arrLength--;
//                 }
//                 list.add(arr[i]);
//             }
//             answer = new int[arrLength];
            
//             for(int i = 0; i < arrLength; i++) {
//                 answer[i] = list.get(i);
//             }   
//         }   
//         return answer;
//     }
// }