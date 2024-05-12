import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        
        int idx = 0;
        for(int i=n;i<num_list.length;i++){
            if(idx == num_list.length){
                break;
            }
            answer[idx++] = num_list[i];
            if(i == num_list.length - 1){
                i = -1;
            }
            
        }
        if(idx == 0){
            return num_list;
        }
        
        return answer;
    }
}