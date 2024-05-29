import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Character> stk = new Stack<>();
        StringBuilder str = new StringBuilder(s);
        
        for(int i=0;i<s.length();i++){
            int big = 0;
            int mid = 0;
            int sml = 0;
            int cnt = 0;
            stk.clear();
            for(int j=0;j<s.length();j++){
                char c = str.charAt(j);
                
                if(stk.isEmpty() && (c == ']' || c == '}'|| c== ')')) break;
                
                if(c == '['){
                     big++;
                     stk.push(c);
                }
                else if(c == '{'){
                    mid++;
                    stk.push(c);
                } 
                else if(c == '('){
                    sml++;
                    stk.push(c);
                } 
                else if(c == ']'){
                    big--;
                    if(stk.peek() != '['){
                        break;
                    }
                    else if(stk.peek() == '['){
                        stk.pop();
                    }
                } 
                else if(c == '}'){
                    mid--;
                    if(stk.peek() != '{'){
                        break;
                    }
                    else if(stk.peek() == '{'){
                        stk.pop();
                    }
                } 
                else if(c == ')'){
                    sml--;
                    if(stk.peek() != '('){
                        break;
                    }
                    else if(stk.peek() == '('){
                        stk.pop();
                    }
                } 
                
                if(big < 0 || sml < 0 || mid < 0) break;
                cnt++;
            }
            if(stk.isEmpty() && cnt == str.length()) answer++;
            char x = str.charAt(0);
            str.deleteCharAt(0);
            str.append(x);
        }
        
        return answer;
    }
}