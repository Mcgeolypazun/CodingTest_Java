import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Map<Integer,Double> map = new HashMap<>();
        
        for(int i=1;i<N+1;i++){
            double denom = 0;
            double numer = 0;
            for(int j=0;j<stages.length;j++){
                if(stages[j] >= i){
                    denom++;
                }
                if(stages[j] == i){
                    numer++;
                }
            }
            
            if(denom == 0) denom = 1;
            
            map.put(i,numer/denom);
        }
        
        List<Map.Entry<Integer,Double>> entryList = new ArrayList<>(map.entrySet());
        
        entryList.sort(Map.Entry.<Integer,Double>comparingByValue().reversed());
        for(int i=0;i<entryList.size();i++){
            answer[i] = entryList.get(i).getKey();
            
        }
        
        return answer;
    }
}