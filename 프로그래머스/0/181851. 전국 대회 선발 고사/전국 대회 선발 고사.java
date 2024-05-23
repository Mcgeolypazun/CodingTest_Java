import java.util.concurrent.*;
import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        ConcurrentHashMap<Integer,Integer> map = new ConcurrentHashMap<>();
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        for(int i=0;i<rank.length;i++){
            if(attendance[i]){
                map.put(rank[i],i);
                list.add(rank[i]);
            }
        }
        Collections.sort(list);
        
        answer = 10000 * map.get(list.get(0)) + 100 * map.get(list.get(1)) + map.get(list.get(2));
        
        return answer;
    }
}