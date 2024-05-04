import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
 
class Building{
    int index;
    int height;
 
    public Building(int index, int height) {
        this.index = index;
        this.height = height;
    }
}
 
public class Main {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());

        Stack<Building> stack = new Stack<>();
        
        String[] s = br.readLine().split(" ");
 
        Building[] arr = new Building[n+1];
        int [][] indexAndGap = new int[n+1][2];
        int [] cnt = new int[n+1];
        
        for(int i = 1; i <= n; i++) {
            arr[i] = new Building(i, Integer.parseInt(s[i-1]));
            Arrays.fill(indexAndGap[i],100001);
        }
 
        for(int i = 1; i <= n; i++) {
            while(!stack.isEmpty() && stack.peek().height <= arr[i].height){
                stack.pop();
            }
 
            cnt[i] += stack.size();
 
            if(!stack.isEmpty()) {
                int gap = Math.abs(stack.peek().index - i);
                if(gap < indexAndGap[i][1]) {
                    indexAndGap[i][0] = stack.peek().index;
                    indexAndGap[i][1] = gap;
                } else if(gap == indexAndGap[i][1] && stack.peek().index < indexAndGap[i][0]) {
                    indexAndGap[i][0] = stack.peek().index;
                }
            }
 
            stack.push(arr[i]);
        }
 
        stack = new Stack<>();
        
        for(int i = n; i >= 1; i--) {
            while(!stack.isEmpty() && stack.peek().height <= arr[i].height) {
                stack.pop();
            }
 
            cnt[i] += stack.size();
 
            if(!stack.isEmpty()) {
                int gap = Math.abs(stack.peek().index - i);
                if(gap<indexAndGap[i][1]) {
                    indexAndGap[i][0] = stack.peek().index;
                    indexAndGap[i][1] = gap;
                } else if(gap == indexAndGap[i][1] && stack.peek().index<indexAndGap[i][0]) {
                    indexAndGap[i][0] = stack.peek().index;
                }
            }
            stack.push(arr[i]);
        }
        
        for(int i = 1; i <= n; i++) {
            if(cnt[i] == 0) {
                sb.append(0).append("\n");
            } else {
                sb.append(cnt[i]).append(" ").append(indexAndGap[i][0]).append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}