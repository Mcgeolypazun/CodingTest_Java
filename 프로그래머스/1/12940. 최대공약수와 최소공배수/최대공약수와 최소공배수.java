import java.util.*;
class Solution {
    int gcd(int a,int b){
        if(b == 0){
            return a;
        }
        
        return gcd(b,a%b);
    }
    
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int count = 0;
        int min = Math.min(n,m);
        int max = Math.max(n,m);
        
        while(true){
            if(min == max){
                answer[1] = min;
                break;
            }
            else if(min > max){
                max += Math.max(n,m);
            }
            
            min += Math.min(n,m);    
        }
        
        answer[0] = gcd(m,n);
        
        
        
        return answer;
    }
}