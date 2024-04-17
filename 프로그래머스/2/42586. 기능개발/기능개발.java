import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer;
        List<Integer> list = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        int len = progresses.length;
        int idx = 0;
        int cnt = 0;
        
        while(idx < progresses.length){
            boolean flag = true;
            for(int i=0;i<len;i++){
                progresses[i] +=  speeds[i];
                if(progresses[i] < 100 && progresses[i] > 0){
                    flag = false;
                }
                if(progresses[i] >= 100){
                    if(flag){
                        stack.push("*");
                        if(idx != i){
                            progresses[i] = 0;
                            speeds[i] = 0;
                        }
                    }
                }
                
                
            }
            if(progresses[idx] >= 100){
                int stkSize = stack.size();
                for(int i=0;i<stkSize;i++){
                    
                    stack.pop();
                    cnt++;
                }
                
                progresses[idx] = 0;
                speeds[idx] = 0;
                list.add(stkSize);
                cnt = 0;
                idx += stkSize;
                
            }
        }
        
        answer = new int[list.size()];
        
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i);
        }
    
        
        return answer;
    }
}