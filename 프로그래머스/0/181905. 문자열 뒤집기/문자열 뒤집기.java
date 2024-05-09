class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        char[] charArr = my_string.toCharArray();
        
        for(int i=s;i<=(s+e)/2;i++){
            char tmp = charArr[i];
            charArr[i] = charArr[e-i+s];
            charArr[e-i+s] = tmp;
        }
        
        return answer = String.valueOf(charArr);
    }
}