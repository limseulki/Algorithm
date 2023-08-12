import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] nums = new int[5];
        int sum = 0;

        for(int i = 0; i < 5; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(nums);
        int mid = nums[2];

        for(int i = 0; i < 5; i++) {
            sum += nums[i];
        }

        int avg = sum/5;
        
        System.out.println(avg);
        System.out.println(mid);
    }
}