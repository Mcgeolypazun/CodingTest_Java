import java.util.*;


class Solution {
    public int solution(int a, int b) {
        int answer = 2;
        
        int min = gcd(a,b);
        int down = b/min;
        
        
        while(down % 2==0){
            down /= 2;
        }
        while(down % 5 == 0){
            down /= 5;
        }
        
        if(down == 1){
            answer = 1;
        }
        else{
            answer = 2;
        }
        
        return answer;
        
    }
    
    public static int gcd(int a,int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    }
}