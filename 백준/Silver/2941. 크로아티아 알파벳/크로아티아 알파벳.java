import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String alphabet = sc.nextLine();

        alphabet = alphabet.replace("c=","1");
        alphabet = alphabet.replace("c-", "1");
        alphabet = alphabet.replace("dz=", "1");
        alphabet = alphabet.replace("d-", "1");
        alphabet = alphabet.replace("lj", "1");
        alphabet = alphabet.replace("nj", "1");
        alphabet = alphabet.replace("s=", "1");
        alphabet = alphabet.replace("z=", "1");

        System.out.println(alphabet.length());
    }
}