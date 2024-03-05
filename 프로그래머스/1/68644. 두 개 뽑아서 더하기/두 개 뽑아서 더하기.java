import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer;
        Set<Integer> intSet = new TreeSet<>();
        
        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                intSet.add(numbers[i] + numbers[j]);
            }
        }
        
        answer = new int[intSet.size()];
        int idx = 0;
        for(Integer b : intSet){
            answer[idx++] = b;
        }
        
        return answer;
    }
}