class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for(int i=0;i<my_string.length();i++){
            if('a' <= my_string.charAt(i) && 'z' >= my_string.charAt(i)){
                answer[my_string.charAt(i) - 'a' + 26]++;
            }
            else{
                answer[my_string.charAt(i) - 'A']++;
            }
        }
        
        return answer;
    }
}