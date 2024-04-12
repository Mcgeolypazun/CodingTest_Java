class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        int length = str1.length()+str2.length();
        int index = 0;
        for(int i=0;i<length;i++){
            if(i % 2 == 0){
                answer += str1.charAt(index);
            }
            else{
                answer += str2.charAt(index);
                index++;
            }
        }
        
        return answer;
    }
}