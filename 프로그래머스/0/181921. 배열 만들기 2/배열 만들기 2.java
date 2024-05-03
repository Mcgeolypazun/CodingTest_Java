import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        int[] answer;
        List<Integer> list = new ArrayList<>();
        
        for(int i=l;i<=r;i++){
            if(i % 5 == 0){
                String str = String.valueOf(i);
                for(int j=0;j<str.length();j++){
                    if(str.charAt(j) != '0'&&str.charAt(j) != '5'){
                        break;
                    }
                    if(j == str.length()-1) list.add(i);
                }
                i+=4;
            }
        }
        
        if (list.isEmpty()) {
            return new int[] {-1};
        }
        answer = new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}