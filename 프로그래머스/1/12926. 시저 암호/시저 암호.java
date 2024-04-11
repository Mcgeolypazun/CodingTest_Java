class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                answer += String.valueOf(s.charAt(i));
                continue;
            }
            else{
                char cur = ' ';
                n = n%26;
                
                if(Character.isUpperCase(s.charAt(i))){
                    cur = (char)((s.charAt(i) - 'A' + n) % 26 + 'A' );
                    
                }
                else if(Character.isLowerCase(s.charAt(i))){
                    cur = (char)((s.charAt(i) - 'a' +n) %26 + 'a');
                }
                answer += String.valueOf(cur);
            }
        }
        
        return answer;
    }
}