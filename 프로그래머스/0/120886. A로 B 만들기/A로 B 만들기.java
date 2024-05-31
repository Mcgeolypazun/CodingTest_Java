class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        int len = before.length();
        StringBuilder str = new StringBuilder(before);
        
        for(int i=0;i<len;i++){
            for(int j=0;j<str.length();j++){
                if(str.charAt(j) == after.charAt(i)){
                    str.deleteCharAt(j);
                    break;
                }
            }
        }
        
        if(str.length() == 0) answer = 1;
        
        return answer;
    }
}