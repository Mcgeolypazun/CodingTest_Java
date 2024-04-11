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
                
                if(Character.isUpperCase(s.charAt(i))){
                    if(cur > 90){
                        cur -= 26;
                    }
                }
                else if(Character.isLowerCase(s.charAt(i))){
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