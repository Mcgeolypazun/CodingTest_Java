class Solution {
    public int solution(String str1, String str2) {
        int answer = 2;
        int str2Len = str2.length();
        
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i) == str2.charAt(0)){
                if(i + str2Len > str1.length()){
                    break;
                }
                for(int j=0;j<str2Len;j++){
                    
                    String q = str1.substring(i,i+str2Len);
                    if(q.equals(str2)){
                        answer = 1;
                        break;
                    }
                }
            }
        }
        
        
        return answer;
    }
}