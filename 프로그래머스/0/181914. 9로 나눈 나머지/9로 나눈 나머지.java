class Solution {
    public int solution(String number) {
        int answer = 0;
        char[] charArr = number.toCharArray();
        
        for(char c : charArr){
            answer += c - 48;
        }
        answer = answer % 9;
        
        return answer;
    }
}