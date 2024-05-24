import java.util.concurrent.*;
class Solution {
    public int solution(String[] strArr) {
        ConcurrentHashMap<Integer,Integer> map = new ConcurrentHashMap<>();
        
        for(String str : strArr){
            int strLen = str.length();
            map.put(strLen,map.getOrDefault(strLen,0)+1);
        }
        int max = Integer.MIN_VALUE;
        for(Integer key : map.keySet()){
            if(max < map.get(key)){
                max = map.get(key);
            }
        }
        
        
        return max;
    }
}