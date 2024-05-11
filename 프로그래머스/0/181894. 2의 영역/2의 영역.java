import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        List<Integer> list = new ArrayList<>();
        boolean flag = true;
        int first2 = 0;
        int second2 = 0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 2 && flag){
                first2 = i;
                flag = false;
            }
            else if(arr[i] == 2){
                second2 = i;
            }
        }
        
        if(arr[first2] == 2 && second2 == 0){
            return new int[]{2};
        }
        
        for(int i=first2;i<second2;i++){
            list.add(arr[i]);
            if(i == second2-1){
                list.add(arr[i+1]);
            }
        }
        if(list.size() != 0){
            answer = new int[list.size()];
            for(int i=0;i<answer.length;i++){
                answer[i] = list.get(i);
            }
        }
        else{
            answer = new int[]{-1};
        }
        
        
        return answer;
    }
}