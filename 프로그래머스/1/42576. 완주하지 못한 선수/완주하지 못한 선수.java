import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(int i=0;i<completion.length;i++){
            if(!participant[i].equals(completion[i])){
                answer = participant[i];
                return answer;
            }
        }
        return participant[participant.length-1];
        
        
//         for(int i=0;i<completion.length;i++){
//             for(int j=0;j<participant.length;j++){
//                 if(completion[i].equals(participant[j]) && !completion[i].equals("Z")){
//                     participant[j] = "Z";
//                     break;
//                 }
//             }
//         }
        
//         for(int i=0;i<participant.length;i++){
//             if(!participant[i].equals("Z")){
//                 answer = participant[i];
//             }
//         }
        
        //return answer;
    }
}