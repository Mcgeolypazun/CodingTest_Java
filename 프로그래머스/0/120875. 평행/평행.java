import java.util.*;
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int a = 0;
        int b = 0;
        Set<Integer> set = new HashSet<>();
        
        if((float)Math.abs(dots[0][0] - dots[1][0])/Math.abs(dots[0][1] - dots[1][1]) == (float)Math.abs(dots[2][0] - dots[3][0])/Math.abs(dots[2][1] - dots[3][1])){
            answer = 1;
            
        }
        if((float)Math.abs(dots[1][0] - dots[3][0])/(float)Math.abs(dots[1][1] - dots[3][1]) == (float)Math.abs(dots[2][0] - dots[0][0])/(float)Math.abs(dots[2][1] - dots[0][1])){
            answer = 1;
        }
        if((float)Math.abs(dots[1][0] - dots[2][0])/(float)Math.abs(dots[1][1] - dots[2][1]) == (float)Math.abs(dots[3][0] - dots[0][0])/(float)Math.abs(dots[3][1] - dots[0][1])){
            answer = 1;
        }
        
        
        return answer;
    }
}