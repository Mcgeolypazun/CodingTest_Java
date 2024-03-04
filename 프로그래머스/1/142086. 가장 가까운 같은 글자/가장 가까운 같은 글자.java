import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        char[] charArr = s.toCharArray();
        List<Character> save = new ArrayList<>();
        int temp = 0;
        
        for(int i=0;i<s.length();i++){
            if(save.contains(s.charAt(i)) == false){
                answer[i] = -1;
                save.add(s.charAt(i));
            }
            else{
                
                for(int j = 0;j<s.length();j++){
                    if(charArr[j] == charArr[i]){
                        if(i == j){
                            answer[i] = j-temp;
                            break;
                        }
                        temp = j;
                    }
                    
                }
                
            }
        }
        
        
        
        return answer;
    }
}