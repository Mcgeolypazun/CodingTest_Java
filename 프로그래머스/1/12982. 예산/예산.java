import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        int idx = 0;
        int count = 0;
        while(true){
            if(idx == d.length || d[idx] > budget){
                break;
            }
            System.out.println(idx +" idx");
            budget -= d[idx];
            count++;
            idx++;
            System.out.println(budget);
            
        }
        
        answer = count;
        return answer;
    }
}