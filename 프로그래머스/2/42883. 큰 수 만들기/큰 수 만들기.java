import java.util.*;
class Solution {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        //stack.push(Integer.parseInt(number.charAt(0)+""));
        int cnt = 0;
        while(true){
            if(k <= 0 || cnt == number.length()){
                break;
            }
            int cur = Integer.parseInt(number.charAt(cnt)+"");
            
            if(!stack.isEmpty() && stack.peek() < cur){
                stack.pop();
                k--;
            }else{
                stack.push(Integer.parseInt(number.charAt(cnt)+""));
                cnt++;
            }
            
            
            
        }
        
        for(int i=cnt;i<number.length();i++){
            if(k == 0){
                stack.push(Integer.parseInt(number.charAt(i)+""));
            }
        }
        
        for(int i=number.length();i>number.length()-k;i--){
            stack.pop();
        }
        
        while(!stack.isEmpty()){
            int s = stack.pop();
            answer.insert(0,String.valueOf(s));
        }
        
        
// 시간 초과        
//         int left = 0;
        
//         while(true){
//             int maxLen = k;
//             int max = -1;
//             int idx = 0;
//             if(k <= 0 || (left+maxLen) >= number.length()){
//                 break;
//             }
            
//             for(int i=left;i<=left + maxLen;i++){
//                 if(max <Integer.parseInt(String.valueOf(number.charAt(i)))){
//                     max = Integer.parseInt(String.valueOf(number.charAt(i)));
//                     idx = i;
//                 }
//             }
            
            
//             answer.append(String.valueOf(number.charAt(idx)));
            
//             k -= idx - left;
//             left = idx + 1; 
            
//         }
        
//         for(int i=left;i<number.length();i++){
//             if(k == 0){
//                 answer.append(String.valueOf(number.charAt(i)));
//             }
//         }
        
        return answer.toString();
    }
}