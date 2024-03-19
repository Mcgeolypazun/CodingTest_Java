import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for(int i=0;i<=n+1;i++){
            map.put(i,0);
        }
        
        for(int res : reserve){
            map.put(res,1);
           // System.out.println(res +" res "+map.get(res));
        }
        
        for(int i=0;i<lost.length;i++){
            if(map.get(lost[i]) == 1){
                map.put(lost[i],2);
                answer++;
            }
        }
        
        for(int i=0;i<lost.length;i++){
            if(map.get(lost[i]) == 1){
                map.put(lost[i],0);
                answer++;
            }
            else if(map.get(lost[i]) == 2){
                continue;
            }
            else if(map.get(lost[i]-1) == 1){
                System.out.print(lost[i]-1+" = " +i+" up");
                map.put(lost[i]-1,0);
                answer++;
            }
            else if(map.get(lost[i]+1) == 1){
                System.out.print(lost[i]+1+" = " +i+" down");
                map.put(lost[i]+1,0);
                answer++;
                
            }
        }
        
        return answer;
    }
}