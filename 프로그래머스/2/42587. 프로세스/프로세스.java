import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int maxIdx = 0;
        int idx = 0;
        int len = priorities.length;
        int max = Integer.MIN_VALUE;
        int order = 1;
        
        while(true){
            for(int i=idx;i<len;i++){
                if(max < priorities[i]){
                    max = priorities[i];
                    maxIdx = i;
                }
            }
            for(int i=0;i<idx;i++){
                if(max < priorities[i]){
                    max = priorities[i];
                    maxIdx = i;
                }
            }
            
            idx = maxIdx;
            
            if(maxIdx == location){
                return order;
            }
            else{
                order++;
                max = Integer.MIN_VALUE;
                priorities[maxIdx] = -100;
            }
            
        }
        
    }
}