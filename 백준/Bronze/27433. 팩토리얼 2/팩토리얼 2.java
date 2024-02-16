import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        long N = scanner.nextLong();
        
        System.out.println(factorial(N));
    }
    
    public static long factorial(long N) {
        if(N == 0 || N == 1) {
            return 1;
        } else {
            return N * factorial(N - 1);
        }
    }
}