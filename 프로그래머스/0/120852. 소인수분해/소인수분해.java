import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer;
        Set<Integer> list = new TreeSet<>();
        
        for(int i=2;i<=n;i++){
            if(n % i == 0){
                list.add(i);
                n = n/i;
                i=1;
            }
        }
        answer = new int[list.size()];
        int idx = 0;
        for(int set : list){
            answer[idx++] = set;
        }
        
        return answer;
    }
}