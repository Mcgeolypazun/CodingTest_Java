import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        for(int n: delete_list) {
            list.remove((Integer)n);
        }
        
        answer = new int[list.size()];
        int idx = 0;
        for(int date : list){
            answer[idx] = list.get(idx);
            idx++;
        }
        
        return answer;
    }
}