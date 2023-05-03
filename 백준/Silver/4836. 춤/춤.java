import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;

        while((s = br.readLine()) != null) {
            // 1. dip은 jiggle을 춘 다음이나 다다음, 또는 twirl을 추기 전에 출 수 있다.
            String[] splitS = s.split(" ");
            List<Integer> index = new ArrayList<>();
            List<Integer> wrongDip = new ArrayList<>();

            int splitSLen = splitS.length;
            for(int i = 0; i < splitSLen; i++) {
                if(!splitS[i].equals("dip")) {
                    continue;
                }
                boolean case1 = false;
                boolean case2 = false;
                boolean case3 = false;

                if(splitS.length != i+1) {
                    if(splitS[i].equals("dip") && splitS[i+1].equals("twirl")) {
                        case1 = true;
                    }
                }
                if(i >= 1) {
                    if(splitS[i].equals("dip") && splitS[i-1].equals("jiggle")) {
                        case2 = true;
                    }
                }
                if(i >= 2) {
                    if(splitS[i].equals("dip") && splitS[i-2].equals("jiggle")) {
                        case3 = true;
                    }
                }
                if(!(case1 || case2 || case3)) {
                    wrongDip.add(i);
                    splitS[i] = "DIP";
                }
            }
            if (wrongDip.size() != 0) {
                index.add(1);
            }
            s = String.join(" ", splitS);

            // 2. 모든 춤은 clap stomp clap으로 끝나야 한다.
            if(!s.endsWith("clap stomp clap")) {
                index.add(2);
            }

            // 3. 만약 twirl을 췄다면, hop도 춰야한다.
            if(s.contains("twirl") && !s.contains("hop")) {
                index.add(3);
            }

            // 4. jiggle로 춤을 시작할 수 없다.
            if(s.startsWith("jiggle")) {
                index.add(4);
            }

            // 5. 반드시 dip을 춰야 한다.
            if(!s.contains("dip") && !s.contains("DIP")) {
                index.add(5);
            }

            // 지키면 from ok: 춤 출력
            // 1개만 어기면 from error 어긴 번호
            // 여러개 어기면 from errors 어긴번호, ... and (오름차순): 춤 출력
            // 1번 규칙 어기면 어긋난 dip을 대문자로 출력
            if(index.size() == 0) {
                System.out.println("form ok: " + s);
            }
            if(index.size() == 1) {
                System.out.println("form error "+index.get(0)+": " + s);
            }
            if(index.size() == 2) {
                System.out.println("form errors "+index.get(0)+" and "+index.get(1)+": " + s);
            }
            if(index.size() == 3) {
                System.out.println("form errors "+index.get(0)+", "+index.get(1)+" and "+index.get(2)+": " + s);
            }
            if(index.size() == 4) {
                System.out.println("form errors "+index.get(0)+", "+index.get(1)+", "+index.get(2)+" and "+index.get(3)+": " + s);
            }
            if(index.size() == 5) {
                System.out.println("form errors "+index.get(0)+", "+index.get(1)+", "+index.get(2)+", "+index.get(3)+" and "+index.get(4)+": " + s);
            }
        }
        br.close();
    }
}