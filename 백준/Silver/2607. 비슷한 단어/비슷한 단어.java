import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String first = br.readLine();
        
        int result = 0;
        int[] words = new int[26];
        int[] check;
        
        for(int i = 0; i < first.length(); i++){
            int index = first.charAt(i) - 'A';
            words[index]++;
        }
        
        for(int i = 0; i < N - 1; i++){
            check = words.clone();
            String str = br.readLine();

            if(Math.abs(str.length() - first.length())>1) {
                continue;
            }

            int count = 0;

            for(int j = 0; j < str.length(); j++){
                int index = str.charAt(j) - 'A';

                if(check[index] > 0){
                    count++;
                    check[index]--;
                }
            }

            if(first.length() - 1 == str.length()) {
                if(count == str.length()) {
                    result++;
                }
            } else if(first.length() + 1 == str.length()) {
                if(count == first.length()) {
                    result++;
                }
            } else if(first.length() == str.length()) {
                if(count == first.length()) {
                    result++;
                } else if(count == first.length() - 1) {
                    result++;
                }
            }
        }
        
        System.out.println(result);
    }
}