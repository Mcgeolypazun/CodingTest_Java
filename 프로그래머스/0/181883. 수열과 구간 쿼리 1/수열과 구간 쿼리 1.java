import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        for(int q[]:queries){
            int a = q[0];
            int b = q[1];
            
            for(int i=a;i<=b;i++){
                arr[i]++;
            }
        }
        
        return arr;
    }
}