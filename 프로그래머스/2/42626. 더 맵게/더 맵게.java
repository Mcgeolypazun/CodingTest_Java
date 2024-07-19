import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = -1;
        PriorityQueue<Integer> sco = new PriorityQueue<>();
        int cnt = 0;
        for(int i=0;i<scoville.length;i++){
            sco.add(scoville[i]);
        }
        
        while(sco.peek() < K){
            int min = sco.poll();
            int secondMin;
            if(!sco.isEmpty()){
                secondMin = sco.poll();
            }
            else{
                return -1;
            } 
            
            min = min + (secondMin * 2);
            
            sco.add(min);
            cnt++;
            
        }
        
        answer = cnt;
        return answer;
    }
}