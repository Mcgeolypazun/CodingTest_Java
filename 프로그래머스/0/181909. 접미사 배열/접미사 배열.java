import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        StringBuilder str = new StringBuilder(my_string);
        
        for(int i=0;i<my_string.length();i++){
            answer[i] = str.toString();
            str.deleteCharAt(0);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}