import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        Arrays.sort(numlist);
        int idx = 0;
        while(true){
            int tmpIdx = 0;
            int min = Integer.MAX_VALUE;
            for(int i=0;i<numlist.length;i++){
                int abs = (int)Math.abs(n-numlist[i]);
                if(abs <= min){
                    min = abs;
                    tmpIdx = i;
                }
            }
            
            answer[idx++] = numlist[tmpIdx];
            numlist[tmpIdx] = Integer.MIN_VALUE;
            if(idx == numlist.length){
                break;
            }
        }
        
        
        return answer;
    }
}