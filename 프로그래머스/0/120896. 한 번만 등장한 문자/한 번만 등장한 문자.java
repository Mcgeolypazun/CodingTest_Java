import java.util.*;
import java.util.concurrent.*;
class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        Map<Character,Integer> map = new HashMap();
        CopyOnWriteArrayList<Character> list = new CopyOnWriteArrayList<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        for(char key : map.keySet()){
            if(map.get(key) == 1){
                list.add(key);
            }
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            answer.append(list.get(i));
        }
        
        return answer.toString();
    }
}