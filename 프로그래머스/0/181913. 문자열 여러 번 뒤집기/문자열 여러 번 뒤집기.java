class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder answer = new StringBuilder();
        char[] charArr = my_string.toCharArray();
        
        for(int i=0;i<queries.length;i++){
            int start = queries[i][0];
            int end = queries[i][1];
            for(int j=start;j<=(start+end)/2;j++){
                char tmp = charArr[j];
                charArr[j] = charArr[start+end-j];
                charArr[start+end-j] = tmp;
            }
        }
        
        for(char c: charArr){
            answer.append(c);
        }
        
        return answer.toString();
    }
}