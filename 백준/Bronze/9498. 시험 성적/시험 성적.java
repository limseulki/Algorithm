import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = Integer.parseInt(br.readLine());
        
        if(score>=90) {
            System.out.print('A');
        } else if(score>=80) {
            System.out.print('B');
        } else if(score>=70) {
            System.out.print('C');
        } else if(score>=60) {
            System.out.print('D');
        } else {
            System.out.print('F');
        } 
    }
}