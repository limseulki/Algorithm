import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] binaryOctal = {"000","001","010","011","100","101","110","111"};
        String str = br.readLine();

        if(str.equals("0")) {
            sb.append(0);
        } else {
            for(int i = 0; i < str.length(); i++) {
                int num = Character.getNumericValue(str.charAt(i));

                if(i == 0 && num < 4) {
                    switch (num) {
                        case 1:
                            sb.append("1");
                            break;
                        case 2:
                            sb.append("10");
                            break;
                        case 3:
                            sb.append("11");
                            break;
                    }
                } else {
                    sb.append(binaryOctal[num]);
                }
            }
        }
        System.out.println(sb.toString());

        br.close();
    }
}