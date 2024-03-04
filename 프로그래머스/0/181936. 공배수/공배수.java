import java.util.*;

class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        List<Integer> divisor = new ArrayList<>();
        int sqrt = (int)Math.sqrt(number);
        
        for(int i=1;i<=sqrt;i++){
            if(number % i == 0){
                divisor.add(i);
                if(i != number/i){
                    divisor.add(number/i);
                }
            }
        }
       
        if(divisor.contains(n)){
            if(divisor.contains(m)){
                answer = 1;
            }
        }
        
        
        return answer;
    }
}