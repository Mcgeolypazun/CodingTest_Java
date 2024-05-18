class Solution {
    public String solution(String myString) {
        StringBuilder answer = new StringBuilder(myString.toLowerCase());
        
        for(int i=0;i<answer.length();i++){
            if(answer.charAt(i) == 'a'){
                answer.deleteCharAt(i);
                answer.insert(i,'A');
            }
        }
        
        
        
        return answer.toString();
    }
}