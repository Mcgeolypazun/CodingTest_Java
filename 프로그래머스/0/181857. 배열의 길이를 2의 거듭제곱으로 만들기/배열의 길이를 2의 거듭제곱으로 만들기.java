import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        List<Integer> list = new ArrayList<>();
        int p = 0;
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        while(true){
            if(Math.pow(2,p) >= arr.length){
                break;
            }
            p++;
        }
        for(int i=list.size();i<Math.pow(2,p);i++){
            list.add(0);
        }
        answer = new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}