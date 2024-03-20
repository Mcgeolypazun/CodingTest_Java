import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                count++;
                if(i != n/i){
                    count++;
                }
            }
        }
        
        answer = count;
        
        return answer;
    }
}