class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder answer = new StringBuilder();
        
        for(int i=0;i<parts.length;i++){
            int s = parts[i][0];
            int e = parts[i][1];
            for(int j=s;j<=e;j++){
                answer.append(my_strings[i].charAt(j));
            }
        }
        
        return answer.toString();
    }
}