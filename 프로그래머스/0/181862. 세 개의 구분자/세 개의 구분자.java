import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        String[] answer = myStr.split("[abc]",-1);
        List<String> list = new ArrayList<>();
        for(int i=0;i<answer.length;i++){
            if(answer[i].length() > 0){
                list.add(answer[i]);
            }
        }
        
        String[] str = new String[list.size()];
        for(int i=0;i<str.length;i++){
            str[i] = list.get(i);
        }
        
        
        return str.length == 0 ? new String[]{"EMPTY"} : str;
    }
}