import java.util.stream.*;
import java.util.*;
class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int point = total+num;
        
        while(true){
            int sum = 0;
            int idx = num-1;
            for(int i=point;i>point-num;i--){
                sum += i;
                answer[idx--] = i;
            }
            point--;
            if(sum == total){
                break;
            }
        }
        
        
        
        
        return answer;
    }
}