import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character,Integer> map = new HashMap<>();
        
        for(int i=0;i<keymap.length;i++) {
            for(int j=0;j<keymap[i].length();j++) {
                char word = keymap[i].charAt(j);
                if(!map.containsKey(word) || (map.containsKey(word) && map.get(word) > j+1)) {
                    map.put(word,j+1);
                }
            }
        }
        
        for(int i=0;i<targets.length;i++) {
            for(int j=0;j<targets[i].length();j++) {
                char targetWord = targets[i].charAt(j);
                if(map.containsKey(targetWord)) {
                    answer[i] += map.get(targetWord);
                }
                else {
                    answer[i] = -1;
                    break;
                }
            }
        }
        
        return answer;
    }
}