class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for(int num : numbers){
            answer += num;
            if(n < answer){
                return answer;
            }
        }
        return answer;
    }
}