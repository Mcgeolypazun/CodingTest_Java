import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int minOfTwo = Math.min(sides[0],sides[1]);
        int sumOfTwo = sides[0]+sides[1];
        int maxOfTwo = Math.max(sides[0],sides[1]);
        
        for(int i=maxOfTwo-minOfTwo + 1;i<sumOfTwo;i++){
             answer += 1;
        }
        
        return answer;
    }
}