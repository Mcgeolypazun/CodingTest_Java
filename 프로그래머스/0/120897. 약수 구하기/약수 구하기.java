import java.util.concurrent.*;
import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer;
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n % i == 0){
                list.add(i);
                if(n/i != i){
                    list.add(n/i);
                }
            }
        }
        
        Collections.sort(list);
        answer = new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}