class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        for(int i=0;i<my_string.length();i++){
            char a = my_string.charAt(i);
            for(int j=0;j<n;j++){
                answer += String.valueOf(a);
            }
        }
        
        return answer;
    }
}