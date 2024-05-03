import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        for(int[] q:queries){
            int s = q[0];
            int e = q[1];
            int k = q[2];
            
            for(int i=s;i<=e;i++){
                if(i % k == 0){
                    arr[i]++;
                    i+=k-1;
                }
            }
        }
        
        int[] answer = Arrays.copyOfRange(arr,0,arr.length);
        
        return answer;
    }
}