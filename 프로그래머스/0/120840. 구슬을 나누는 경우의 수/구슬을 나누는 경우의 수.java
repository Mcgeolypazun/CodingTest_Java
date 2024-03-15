import java.math.BigInteger;

class Solution {
    public BigInteger solution(int balls, int share) {
        BigInteger numerator = BigInteger.ONE;
        BigInteger denominator = BigInteger.ONE;

        for (int i = 1; i <= share; i++) {
            numerator = numerator.multiply(BigInteger.valueOf(balls - (i - 1)));
            denominator = denominator.multiply(BigInteger.valueOf(i));
        }

        return numerator.divide(denominator);
    }
}
