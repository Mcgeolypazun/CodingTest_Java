class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 32){
                answer += String.valueOf(s.charAt(i));
                continue;
            }
            else{
                char cur =(char)(s.charAt(i) + n);
                
                if(s.charAt(i) >= 65 && s.charAt(i) <=90){
                    if(cur > 90){
                        cur -= 26;
                    }
                }
                else if(s.charAt(i) >= 97 && s.charAt(i) <=122){
                    if(cur > 122){
                        cur -= 26;
                    }
                }
                answer += String.valueOf(cur);
            }
        }
        
        return answer;
    }
}