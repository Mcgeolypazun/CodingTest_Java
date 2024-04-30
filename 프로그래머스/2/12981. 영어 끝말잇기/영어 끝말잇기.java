import java.util.concurrent.ConcurrentHashMap;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap<>();
        int count = 1;
        int Human = 1;
        
        map.put(words[0],Human++);
        
        for(int i=1;i<words.length;i++){
            char pre = words[i-1].charAt(words[i-1].length()-1);
            if(pre != words[i].charAt(0)){
                answer[0] = Human;
                answer[1] = count;
                break;
            }
            if(map.containsKey(words[i])){
                answer[0] = Human;
                answer[1] = count;
                break;
            }
            else{
                Human++;
                map.put(words[i],Human);
            }
            
            if(Human > n){
                Human = 1;
                count++;
            }
        }
        

        return answer;
    }
}