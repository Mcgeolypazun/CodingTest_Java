import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> ordStk = new Stack<>();
        Stack<Integer> tempStk = new Stack<>();
        int size = order.length;
        for(int i=size;i>0;i--){
            ordStk.push(i);
        }
        int ordIdx = 0;
        while(!ordStk.isEmpty()){
            
            if(ordStk.peek() == order[ordIdx]){
                ordStk.pop();
                ordIdx++;
                answer++;
            }
            else{
                if(tempStk.isEmpty() || tempStk.peek() != order[ordIdx]){
                    tempStk.push(ordStk.pop());
                }
                else if(tempStk.peek() == order[ordIdx]){
                    tempStk.pop();
                    ordIdx++;
                    answer++;
                }
            }
        }
        
        while(!tempStk.isEmpty()){
            if(tempStk.peek() == order[ordIdx++]){
                answer++;
                tempStk.pop();
            }
            else break;
        }
        
        return answer;
    }
}