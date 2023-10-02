import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

        String firstColor = br.readLine();
        String secondColor = br.readLine();
        String thirdColor = br.readLine();

        int value1 = Arrays.asList(colors).indexOf(firstColor);
        int value2 = Arrays.asList(colors).indexOf(secondColor);
        long mux = (long)Math.pow(10, Arrays.asList(colors).indexOf(thirdColor));

        long answer = (value1*10 + value2) * mux;

        System.out.println(answer);

        br.close();
    }
}