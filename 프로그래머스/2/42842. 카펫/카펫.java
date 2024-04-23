class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int vertical = 1;
        int horizon = (brown - 2)/2 - 2;
        
        while(true){
            if(vertical > horizon){
                break;
            }
            if(vertical * horizon == yellow){
                break;
            }
            else{
                vertical += 1;
                horizon -= 1;
                
            }
        }
        answer[0] = horizon+2;
        answer[1] = vertical+2;
        return answer;
    }
}