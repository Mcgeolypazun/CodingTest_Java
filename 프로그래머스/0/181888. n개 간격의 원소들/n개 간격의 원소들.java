import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer;
        List<Integer> list = new ArrayList<>();
        
        for(int i=0;i<num_list.length;i+=n){
            list.add(num_list[i]);
        }
        
        answer = new int[list.size()];
        int idx = 0;
        for(int l : list){
            answer[idx] = list.get(idx);
            idx++;
        }
        
        return answer;
    }
}