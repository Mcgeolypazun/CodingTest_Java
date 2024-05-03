import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] stk;
        Deque<Integer> dq = new LinkedList<>();
        
        int i = 0;
        while(true){
            if(i == arr.length){
                break;
            }
            
            if(dq.isEmpty()) dq.addFirst(arr[i++]);
            else if(dq.getLast() < arr[i]) dq.addLast(arr[i++]);
            else{
                dq.removeLast();
            }
        }
        
        stk = new int[dq.size()];
        for(int j=0;j<stk.length;j++){
            stk[j] = dq.removeFirst();
        }
        
        
        return stk;
    }
}