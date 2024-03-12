import java.util.*;
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int painted = section[0]+m-1;
        
        for(int i=1;i<section.length;i++){
            if(painted >= section[i]) continue;
            else{
                answer++;
                painted = section[i]+m-1;
            }
        }
            
       
        
        
        return answer;
    }
}