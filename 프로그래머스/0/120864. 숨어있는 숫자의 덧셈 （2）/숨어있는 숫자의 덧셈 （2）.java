class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String tmp = "";
        for(int i=0;i<my_string.length();i++){
            
            if(my_string.charAt(i) >= 48 && my_string.charAt(i) <= 57){
                tmp += String.valueOf(my_string.charAt(i));
            }
            else if(!tmp.equals("")){
                answer += Integer.parseInt(tmp);
                tmp = "";
            }
            
            
            if(i == my_string.length()-1 && !tmp.equals("")){
                answer += Integer.parseInt(tmp);
            }
        }
        
        
        return answer;
    }
}