import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer;
        StringBuilder str = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        
        for(int i=0;i<intStrs.length;i++){
            for(int j=s;j<s+l;j++){
                str.append(String.valueOf(intStrs[i].charAt(j)));
            }
            intStrs[i] = str.toString();
            str.setLength(0);
        }
        
        for(String strs : intStrs){
            int ss = Integer.parseInt(strs);
            if(k < ss){
                list.add(ss);
            }
        }
        
        answer = new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        
        
        return answer;
    }
}