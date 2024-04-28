import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		int n = Integer.parseInt(br.readLine());
		ArrayList<String> list = new ArrayList<>();
        
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			if(!list.contains(s))
				list.add(s);
		}
		
		int resultStr1 = 0;
		int resultStr2 = 0;
		int max = 0;
        
		for(int i = 0; i < n; i++) {
			String str1 = list.get(i);
            
			for(int j = i + 1; j < n; j++) {
				int count = 0;
				String str2 = list.get(j);
				int size = Math.min(str1.length(), str2.length());
                
				for(int k = 0; k < size; k++) {
					if(str1.charAt(k) == str2.charAt(k)) {
                        count++;
                    } else {
                        break;
                    }
				}
                
				if(count > max) {
					resultStr1 = i;
					resultStr2 = j;
					max = count;
				}
			}
		}
        
		System.out.println(list.get(resultStr1));
		System.out.println(list.get(resultStr2));
	}
}