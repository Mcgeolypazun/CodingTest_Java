import java.util.*;
import java.util.concurrent.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer;
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            int cnt = 0;
            for(int j=0;j<delete_list.length;j++){
                if(arr[i] != delete_list[j]){
                    cnt++;
                }
                if(cnt == delete_list.length){
                    list.add(arr[i]);
                }
            }
        }
        answer = new int[list.size()];
        int idx = 0;
        for(int i : list){
            answer[idx++] = i;
        }
        
        return answer;
    }
}