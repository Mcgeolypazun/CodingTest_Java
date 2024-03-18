class Solution {
    public int[] solution(int start, int end_num) {
        int[] answer = new int[start - end_num+1];
        int count = 0;
        while(count < answer.length){
            
            answer[count] = start - count;
            count++;
        }
        
        return answer;
    }
}