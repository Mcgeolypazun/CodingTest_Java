import java.util.*;
class Solution {
    public int[] solution(String msg) {
        int[] answer;
        char msgChar[] = msg.toCharArray();
        ArrayList<Integer> arr = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        int idx = 27;
        
        for(int i=0;i<26;i++){
            map.put((char)(65+i)+"",i+1);
        }
        
        
       
        for(int i=0;i<msgChar.length;i++){
            String pre = msgChar[i]+"";
            String tmp = msgChar[i]+"";
            if(i == msgChar.length-1){
                arr.add(map.get(tmp));
            }
            for(int j=i+1;j<msgChar.length;j++){
                pre = tmp;
                tmp += msgChar[j];
                if(!map.containsKey(tmp)){
                    map.put(tmp,idx);
                    arr.add(map.get(pre));
                    i = j-1;
                    idx++;
                    break;
                }
                if(j == msgChar.length-1){
                    arr.add(map.get(tmp));
                    i=j;
                    break;
                }
            }
            
            
        }
        
        answer = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            answer[i] = arr.get(i);
        }
        
        return answer;
    }
}