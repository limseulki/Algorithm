import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        HashSet<String> work = new HashSet<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            String state = st.nextToken();

            if(state.equals("enter")) {
                work.add(name);
            } else if(state.equals("leave")) {
                work.remove(name);
            }
        }
        
        br.close();

        ArrayList<String> arrList = new ArrayList<String>(work);
        Collections.sort(arrList);

        for(int i = arrList.size() - 1; i >= 0; i--) {
            bw.write(arrList.get(i) + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}