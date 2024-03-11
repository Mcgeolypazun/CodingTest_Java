import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        
       for(int i=0;i<numbers.length;i++){
           int value = 0;
           for(int j=i+1;j<numbers.length;j++){
               value = numbers[i] * numbers[j];
               if(max < value){
                   max = value;
               }
           }
       }
       answer = max;     
        
        return answer;
    }
}