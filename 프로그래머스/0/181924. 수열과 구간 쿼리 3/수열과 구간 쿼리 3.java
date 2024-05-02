import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        LinkedList<Integer> link = new LinkedList<>();
        
        for(int i=0;i<arr.length;i++){
            link.add(arr[i]);
        }
        
        for(int q[] : queries){
            int i = q[0];
            int j = q[1];
            
            int tmp = link.get(i);
            link.set(i,link.get(j));
            link.set(j,tmp);
        }
        
        for(int i=0;i<arr.length;i++){
            answer[i] = link.get(i);
        }
        
        return answer;
    }
}