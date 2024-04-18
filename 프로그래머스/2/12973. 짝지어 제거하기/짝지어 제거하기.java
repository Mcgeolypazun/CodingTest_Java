import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        Stack<Character> stack = new Stack();
        char[] str = s.toCharArray();
        
        stack.push(str[0]);
        for(int i=1;i<str.length;i++){
            char tmpPeek;
            if(!stack.isEmpty()){
                tmpPeek = stack.peek();
            }else{
                tmpPeek = ' ';
            }
            
            stack.push(str[i]);
            if(stack.peek() == tmpPeek){
                stack.pop();
                stack.pop();
            }
        }
        
        
        if(stack.isEmpty()){
            answer = 1;
        }
        
        return answer;
        
    }
}