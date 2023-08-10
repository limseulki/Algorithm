import java.lang.*;
import java.math.*;

class Solution {
    public int solution(int balls, int share) {
        int answer = 0;
        BigInteger n = BigInteger.ONE;
        BigInteger m = BigInteger.ONE;
        long select1 = balls-share > share ? balls-share : share;
        long select2 = balls-share > share ? share : balls-share;
        
        for(long i = select1+1; i <= balls; i++) {
            n = n.multiply(BigInteger.valueOf(i));
        }
            
        for(long i = 1; i <= select2; i++) {
            m = m.multiply(BigInteger.valueOf(i));
        }
        
        answer = n.divide(m).intValue();
        
        return answer;
    }
}