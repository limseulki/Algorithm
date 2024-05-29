import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

class Main {
    
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  static boolean [][]dp = new boolean[202][202];
    
  public static void main(String[] args) throws Exception {
      
    int n = Integer.parseInt(br.readLine());
      
    for(int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
        
      String a = st.nextToken();
      String b = st.nextToken();
      String c = st.nextToken();
        
      for(int j = 0; j <= a.length(); j++) {
          Arrays.fill(dp[j], false);
      }
      if(a.charAt(0) == c.charAt(0)) {
          dp[1][0] = true;
      }
      if(b.charAt(0) == c.charAt(0)) {
          dp[0][1] = true;
      }
        
      for(int j = 0; j <= a.length(); j++) {
        for(int k = 0; k <= b.length(); k++) {
          if(j >= 1 && dp[j-1][k] && c.charAt((j+k-1)) == a.charAt(j-1)) {
              dp[j][k] = true;
          }
          if(k >=1 && dp[j][k-1] && c.charAt((j+k-1)) == b.charAt(k-1)) {
              dp[j][k] = true;
          }
        }
      }
      bw.write("Data set " + (i+1) + ": " + (dp[a.length()][b.length()] ? "yes\n" : "no\n"));
    }
    bw.flush();
  }
}