import java.util.Arrays;
class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = new String[0];
        
        for(int i=0;i<str_list.length;i++){
            if(str_list[i].equals("l")){
                // answer = new String[i];
                answer = Arrays.copyOfRange(str_list,0,i);
                
                break;
            }
            else if(str_list[i].equals("r")){
                // answer = new String[str_list.length - i - 1];
                answer = Arrays.copyOfRange(str_list,i+1,str_list.length);
                break;
            }
        }
        
        
        return answer;
    }
}