import java.util.*;
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        Map<Character,Integer> map = new HashMap<>();
        
        for(int i=0;i<skill.length();i++){
            map.put(skill.charAt(i),i);
        }
        
        for(int i=0;i<skill_trees.length;i++){
            int skill_len = skill_trees[i].length();
            int idx = 0;
            for(int j=0;j<skill_len;j++){
                if(map.containsKey(skill_trees[i].charAt(j))){
                    if(map.get(skill_trees[i].charAt(j)) == idx){
                        idx++;
                    }
                    else{
                        idx = -1;
                        break;
                    }
                }
            }
            if(idx >= 0) answer++;
        }
        
        return answer;
    }
}