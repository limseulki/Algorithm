import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] subject = new String[20];
        Double[] gradeRating = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0};
        String[] gradeList = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"};
        double sum = 0;
        int sumGrade = 0;
        double majorRating = 0;

        for(int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            subject[i] = st.nextToken();
            double rating = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            for(int j = 0; j < 10; j++) {
                if(grade.equals(gradeList[j])) {
                    sum += rating * gradeRating[j];
                    if(j != 9) {
                        sumGrade += rating;
                    }
                }
            }
        }
        majorRating = sum / sumGrade;
        System.out.println(majorRating);

        br.close();
    }
}