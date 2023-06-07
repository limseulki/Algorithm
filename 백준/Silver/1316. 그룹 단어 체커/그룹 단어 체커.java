import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i = 0; i < N; i++) {
            String words = br.readLine();
            if(isGroupWord(words)) {
                count++;
                
            }
        }
        System.out.println(count);
    }

    public static boolean isGroupWord(String words) {
        ArrayList<String> oneWordList = new ArrayList<String>();

        for(int i = 0; i < words.length(); i++) {
            String oneWord =  words.substring(i, i+1);
            if(!oneWordList.contains(oneWord)) {
                oneWordList.add(oneWord);
            } else if(words.charAt(i-1) != words.charAt((i))) {
                return false;
            }
        }
        return true;
    }
}