import java.util.*;
class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        int tmp = 1;
        for(int i=1;i<=count;i++){
            tmp = price * i;
            answer += tmp;
        }
        
        answer -= money;
        
        if(answer < 0){
            answer = 0;
        }
        
        return answer;
    }
}