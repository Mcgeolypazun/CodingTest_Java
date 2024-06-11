import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        int min = Integer.MAX_VALUE;
        int idx = 0;
        for(int i=score.length-1;i>=0;i--){
            
            if(min > score[i]){
                min = score[i];
            }
            
            if((idx+1) % m == 0){
                answer += min * m;
                min = Integer.MAX_VALUE;
            }
            idx++;
        }
        
        return answer;
    }
}