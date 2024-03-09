class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        char alphabet = letter.charAt(0);
        int count = 0;
        
        for(int i=0;i<my_string.length();i++){
            if(my_string.charAt(i) == alphabet){
                answer += my_string.substring(count,i);
                count = i+1;
            }
        }
        
        answer += my_string.substring(count,my_string.length());
        
        return answer;
    }
}