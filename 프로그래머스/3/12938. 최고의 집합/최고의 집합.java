import java.util.*;
class Solution {
    public int[] solution(int n, int s) {
        int[] answer = new int[n];
        
        answer[0] = s/n;
        int rest = s - answer[0] * n;
        if(answer[0] == 0) return new int[]{-1};
        
        for(int i=n-1;i>=1;i--){
            answer[i] = s/n;
            if(rest != 0){
                rest--;
                answer[i]++;
            }
        }
        
        return answer;
    }
}