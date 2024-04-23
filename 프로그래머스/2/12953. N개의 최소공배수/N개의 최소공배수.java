import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        for(int i=1;i<arr.length-1;i++){
            int next = arr[i+1];
            answer = arr[i];
            while(true){
                if(answer == next){
                    arr[i] = answer;
                    arr[i+1] = next;
                    break;
                }else if(answer > next){
                    next += arr[i+1];
                }else if(answer < next){
                    answer += arr[i];
                }
            }
            
        }
        
        return answer;
    }
}