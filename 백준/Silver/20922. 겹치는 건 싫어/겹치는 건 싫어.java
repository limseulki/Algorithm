import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
 
 
public class Main {
 
    static int N, K;
    static Map<String, Integer> map = new HashMap<>();
 
    static int[] arr;
    static int[] count;
    static int result;
 
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        String[] str1 = br.readLine().split(" ");
 
        N = Integer.parseInt(str1[0]);
        K = Integer.parseInt(str1[1]);
 
        String[] str2 = br.readLine().split(" ");
 
        arr = new int[N];
        count = new int[100001];
 
        for(int i = 0; i < str2.length; i++){
            arr[i] = Integer.parseInt(str2[i]);
        }
        
        two();
 
        System.out.println(result);
    }
 
    private static void two() {
        int left = 0;
        int right = 0;
 
        while(left <= right){
            if(right <= N - 1 && count[arr[right]] < K) {
                count[arr[right]]++;
                right++;
            } else if(count[arr[right]] == K) {
                count[arr[left]]--;
                left++;
            }
            
            result = Math.max(right - left, result);
 
            if(right == N) {
                return;
            }
        }
    }
}