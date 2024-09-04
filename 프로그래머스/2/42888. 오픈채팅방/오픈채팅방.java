import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        String[] answer;
        Map<String,String> map = new TreeMap<>();//hashmap은 o(1) , treemap은 o(logN) 이다
        Queue<String[]> qString = new LinkedList<>();
        
        for(String oneRecord : record) {
            String[] splitRecord = oneRecord.split(" ");
            
            if(splitRecord[0].equals("Enter")) {
                qString.offer(new String[]{splitRecord[0],splitRecord[1]});
                map.put(splitRecord[1],splitRecord[2]);
                
            } else if(splitRecord[0].equals("Leave")) {
                qString.offer(new String[]{splitRecord[0],splitRecord[1]});
                
            } else if(splitRecord[0].equals("Change")) {
                map.put(splitRecord[1],splitRecord[2]);
            }
        }
        
        answer = new String[qString.size()];
        int idx = 0;
        for(String q[] : qString) {
            String inOut = q[0];
            String id = map.get(q[1]);
            
            if(inOut.equals("Enter")) {
                answer[idx++] = id + "님이 들어왔습니다.";
            } else {
                answer[idx++] = id + "님이 나갔습니다.";
            }
        }
        
        
        return answer;
    }
}