import java.util.*;
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int width = 0;
        int length = 0;
        
        for(int i=0;i<dots.length;i++){
            if(dots[0][0] != dots[i][0]){
                width = Math.abs(dots[0][0] - dots[i][0]);
                
            }
            if(dots[0][1] != dots[i][1]){
                length = Math.abs(dots[0][1] - dots[i][1]);
            }
        }
        
        answer = width * length;
        
        return answer;
    }
}