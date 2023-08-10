import java.lang.*;
import java.math.*;

class Solution {
    public BigInteger solution(int balls, int share) {
        
        BigInteger n = BigInteger.ONE;
        BigInteger m = BigInteger.ONE;
        long select1 = balls-share > share ? balls-share : share;
        long select2 = balls-share > share ? share : balls-share;
        
        for(long i = select1+1; i <= balls; i++) {
            n = n.multiply(BigInteger.valueOf(i));
        }
            
        for(long i = 2L; i <= select2; i++) {
            m = m.multiply(BigInteger.valueOf(i));
        }
        
        return n.divide(m);
    }
}