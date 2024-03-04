import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        int count = 0;
        Map<String,Integer> a = new HashMap<>();
        
        for(int i=0;i<participant.length;i++){
            a.put(participant[i],a.getOrDefault(participant[i],0) + 1);
        }
        
        Set<String> setMap = a.keySet();
        for(int i=0;i<completion.length;i++){
            if(a.containsKey(completion[i])){
                a.put(completion[i],a.get(completion[i])-1);
                if(a.get(completion[i]) == 0){
                    a.remove(completion[i]);
                }
            }
        }
        
        
        for(String c : setMap){
            if(a.get(c) > 0){
                answer = c;
                break;
            }
        }
        
        
        return answer;
        
//         Arrays.sort(participant);
//         Arrays.sort(completion);
        
//         for(int i=0;i<completion.length;i++){
//             if(!participant[i].equals(completion[i])){
//                 answer = participant[i];
//                 return answer;
//             }
//         }
//         return participant[participant.length-1];
        
        
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