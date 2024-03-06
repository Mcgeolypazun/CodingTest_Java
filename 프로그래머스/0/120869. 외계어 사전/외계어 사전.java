import java.util.*;
class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        List<Character> spellList = new ArrayList<>();
        List<Character> dicList = new ArrayList<>();
        
        for(int i=0;i<spell.length;i++){
            spellList.add(spell[i].charAt(0));
        }
        Collections.sort(spellList);
        
        for(int i=0;i<dic.length;i++){
            for(int j=0;j<dic[i].length();j++){
                dicList.add(dic[i].charAt(j));
            }
            Collections.sort(dicList);
            System.out.println(dicList);
                System.out.println(spellList);
            if(spellList.equals(dicList)){
                
                return 1;
            }
            dicList.clear();
        }
        
        return 2;
    }
}