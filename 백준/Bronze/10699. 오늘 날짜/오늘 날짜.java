import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;
 
 
class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       Date now = new Date();
        
       SimpleDateFormat form = new SimpleDateFormat("YYYY-MM-dd");
        
       String now_form = form.format(now);
        
       System.out.println(now_form);  
    }
}