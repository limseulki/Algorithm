import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        String[] arr = br.readLine().split(" ");
        int[] nums = new int[N];
        
        for(int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }

        int[] nums2 = nums.clone();
        
        Arrays.sort(nums2);

        Map<Integer, Integer> map = new HashMap<>();
        
        int index = 0;
        
        for(int n : nums2) {
            if (!map.containsKey(n))
                map.put(n, index++);
        }

        StringBuilder sb = new StringBuilder();
        
        for(int n : nums) {
            sb.append(map.get(n)).append(' ');
        }

        System.out.println(sb.toString());
	}
}