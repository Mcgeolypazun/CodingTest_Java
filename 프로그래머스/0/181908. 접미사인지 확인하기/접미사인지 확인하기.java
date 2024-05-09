class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        int myStrLen = my_string.length();
        StringBuilder strB = new StringBuilder(my_string);
        
        for(int i=0;i<myStrLen;i++){
            if(is_suffix.equals(strB.toString())){
                answer = 1;
                break;
            }
            strB.deleteCharAt(0);
        }
        
        return answer;
    }
}