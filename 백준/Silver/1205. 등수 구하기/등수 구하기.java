import java.io.*;
import java.util.*;
 
public class Main {
    
   public static void main(String[] args) throws IOException {
       
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(in.readLine());
 
      int N = Integer.parseInt(st.nextToken());
      int score = Integer.parseInt(st.nextToken());
      int P = Integer.parseInt(st.nextToken());
 
      int[] newScore = new int[P];
       
      if(N > 0) {
         st = new StringTokenizer(in.readLine());
         for(int i = 0; i < N; i++) {
             newScore[i] = Integer.parseInt(st.nextToken());
         }
      }
 
      Arrays.sort(newScore);
 
      if(P == N && newScore[0] >= score) {
         System.out.println(-1);
         return;
      }
 
      int count = 1;
       
      for(int i = P - 1; i >= Math.max(0, P-N-1); i--) {
         if(newScore[i] > score) {
             count++;
         } else {
             break;
         }
      }
      System.out.println(count);
   }
}