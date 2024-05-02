import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        LinkedList<Integer> link = new LinkedList<>();
        
        for(int i=0;i<arr.length;i++){
            link.add(arr[i]);
        }
        
        for(int i=0;i<queries.length;i++){
            
            int tmp = link.get(queries[i][0]);
            link.set(queries[i][0],link.get(queries[i][1]));
            link.set(queries[i][1],tmp);
            
        }
        
        for(int i=0;i<arr.length;i++){
            answer[i] = link.get(i);
        }
        
        return answer;
    }
}