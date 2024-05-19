class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        StringBuilder str = new StringBuilder(myString);
        while(true){
            if(str.indexOf(pat) == -1){
                break;
            }
            str.delete(str.lastIndexOf(pat)+pat.length()-1,str.length());
            answer++;
            
        }
        
        
        return answer;
    }
}