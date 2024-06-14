import java.util.*;
import java.math.*;

class Solution {
    boolean isPrime(String str){
        if(str.length() == 0) return false;
        long intstr = Long.parseLong(str);
        if(intstr < 2) return false;
        
        
        for(long i=2;i<=Math.sqrt(intstr);i++){
            
            if(intstr % i == 0) return false;
        }
        
        return true;
    }
    
    public int solution(int n, int k) {
        int answer = 0;
        String str = Integer.toString(n,k);
        StringBuilder strB = new StringBuilder();
        
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '0'){
                if(isPrime(strB.toString())){
                    System.out.println(strB);
                    answer++;
                }
                strB.setLength(0);
            }
            else{
                strB.append(str.charAt(i));
            }
            
            if(i == str.length()-1 && strB.length() > 0){
                if(isPrime(strB.toString())){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}