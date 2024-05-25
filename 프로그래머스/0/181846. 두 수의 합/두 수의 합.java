import java.math.BigInteger;
class Solution {
    public String solution(String a, String b){
        BigInteger z = new BigInteger(a);
        BigInteger s = new BigInteger(b);
        BigInteger sum = z.add(s);
        
        return String.valueOf(sum);
    }
}