import java.io.*;
import java.util.*;

public class Main {
	
	static int max = 0;
    
	public static void main(String[] args) throws IOException {
        
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
        
		int[] T = new int[c];
		int[] P = new int[c];
        int[] dp = new int[c+1];
        
		for(int i = 0; i < c; i++) {
			T[i]=sc.nextInt();	
			P[i]=sc.nextInt();	
		}
		
		for(int i = 0; i < c; i++) {
			 if(i + T[i] <= c) {
				 dp[i + T[i]] = Math.max(dp[i + T[i]], dp[i] + P[i]);	
			 }
			 dp[i + 1] = Math.max(dp[i + 1], dp[i]);
		}
        
		System.out.println(dp[c]);	
	}
}