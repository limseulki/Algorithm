import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String dial = br.readLine();
        int dialLen = dial.length();
        int minTime = 0;

        for(int i = 0; i < dialLen; i++) {
            switch (dial.charAt(i)) {
                case 'A' : case 'B' : case 'C' :
                    minTime += 3;
                    break;
                case 'D' : case 'E' : case 'F' :
                    minTime += 4;
                    break;
                case 'G' : case 'H' : case 'I' :
                    minTime += 5;
                    break;
                case 'J' : case 'K' : case 'L' :
                    minTime += 6;
                    break;
                case 'M' : case 'N' : case 'O' :
                    minTime += 7;
                    break;
                case 'P' : case 'Q' : case 'R' : case 'S' :
                    minTime += 8;
                    break;
                case 'T' : case 'U' : case 'V' :
                    minTime += 9;
                    break;
                case 'W' : case 'X' : case 'Y' : case 'Z' :
                    minTime += 10;
                    break;
            }
        }
        System.out.println(minTime);
    }
}