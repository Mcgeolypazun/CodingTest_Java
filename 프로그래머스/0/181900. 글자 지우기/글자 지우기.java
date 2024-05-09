class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder();
        char[] charArr = my_string.toCharArray();
        
        for(int i=0;i<indices.length;i++){
            charArr[indices[i]] = 'A';
        }
        for(int i=0;i<charArr.length;i++){
            if(charArr[i] != 'A'){
                answer.append(charArr[i]);
            }
        }
        
        return answer.toString();
    }
}