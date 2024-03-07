import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        
        answer[0] = (int)Arrays.stream(num_list).filter(s -> s % 2 == 0).count();     
        
        answer[1] = num_list.length - answer[0];
        
        return answer;
    }
}