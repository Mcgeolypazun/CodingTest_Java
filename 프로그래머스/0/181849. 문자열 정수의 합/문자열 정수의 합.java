class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        for(int i=num_str.length()-1;i>=0;i--){
            answer += num_str.charAt(i) - '0';
        }
        
        return answer;
    }
}