class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder(s.toLowerCase());
        if(answer.charAt(0) >= 'a' && answer.charAt(0) <= 'z'){
            answer.setCharAt(0,(char)(answer.charAt(0)-32));
        }
        
        for(int i=1;i<s.length();i++){
            if(answer.charAt(i-1) == ' ' && answer.charAt(i) >= 'a' && answer.charAt(i) <= 'z'){
                answer.setCharAt(i,(char)(answer.charAt(i)-32));
            }
        }
        
        return answer.toString();
    }
}