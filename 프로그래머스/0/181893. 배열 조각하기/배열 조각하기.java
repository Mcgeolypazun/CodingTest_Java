import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        Deque<Integer> list = new ArrayDeque<>();
        
        
        for(int i=0;i<arr.length;i++){
            list.addLast(arr[i]);
        }
        
        for(int i=0;i<query.length;i++){
            int len = list.size();
            if(i % 2 == 0){
                for(int j=len-1;j>query[i];j--){
                    list.pollLast();
                }
            }
            else{
                for(int j=0;j<query[i];j++){
                    list.pollFirst();
                }
            }
        }
        int[] answer = new int[list.size()];
        int len = list.size();
        for(int i=0;i<len;i++){
            answer[i] = list.pollFirst();
        }
        
        return answer;
    }
}