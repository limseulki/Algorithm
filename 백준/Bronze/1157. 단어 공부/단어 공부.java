import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        br.close();

        int[] arr = new int[26];

        for(int i = 0; i < word.length(); i++) {
            int one_word = word.charAt(i);
            if(97 <= one_word && one_word <= 122) {
                arr[one_word - 97]++;
            } else {
                arr[one_word - 65]++;
            }
        }
        int max = -1;
        char index = 0;

        for(int i = 0; i < 26; i++) {
            if(arr[i] > max) {
                max = arr[i];
                index = (char)(i+65);
            } else if(arr[i] == max) {
                index = '?';
            }
        }
        System.out.println(index);
    }
}