import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        
        for(int i=0;i<babbling.length;i++){
            String str = babbling[i].replaceAll("(aya|ye|ma|woo)","");
            str = str.replaceAll("[a-z]","*");
            if(!str.contains("*")) answer++;
        }
        
        return answer;
    }
}