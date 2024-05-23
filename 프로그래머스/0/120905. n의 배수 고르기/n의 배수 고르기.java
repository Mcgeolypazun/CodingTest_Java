import java.util.*;
import java.util.concurrent.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer;
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        for(int i=0;i<numlist.length;i++){
            if(numlist[i]%n == 0) list.add(numlist[i]);
        }
        
        answer = new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}