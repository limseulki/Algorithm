import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int price = 0;
        int max = 0;
        
        if(A != B && B != C && A != C) {
            if(A>B) {
                if(C>A) {
                    max = C;
                } else {
                    max = A;
                }
            } else {
                if(C>B) {
                    max = C;
                } else {
                    max = B;
                }
            }
            price = max*100;
            System.out.print(price);
        }
        else {
            if(A==B && B==C) {
                price = 10000+A*1000;
                System.out.print(price);
            } else {
                if(A==B || A==C) {
                   price = 1000+A*100;
                   System.out.print(price);
                } else {
                    price = 1000+B*100;
                    System.out.print(price);
                }
            }
        }
    }
}
