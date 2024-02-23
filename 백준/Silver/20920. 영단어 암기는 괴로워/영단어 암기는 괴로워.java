import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> wordBook = new HashMap<String, Integer>();

        for(int i = 0; i < N; i++){
            String word = br.readLine();
            
            if(word.length() < M) {
                continue;
            }

            Integer count = wordBook.getOrDefault(word, 0);
            
            wordBook.put(word, count + 1);
        }
        
        List<String> words = wordBook.keySet().stream().collect(Collectors.toList());

        words.sort((a, b) -> {
            int w1 = wordBook.get(a);
            int w2 = wordBook.get(b);

            if(w1 == w2){
                if(a.length() == b.length()) {
                    return a.compareTo(b);
                }
                return b.length() - a.length();
            }
            return w2 - w1;
        });
        
        for(int i = 0; i < words.size(); i++){
            sb.append(words.get(i)).append("\n");
        }
        
        System.out.println(sb);
    }
}