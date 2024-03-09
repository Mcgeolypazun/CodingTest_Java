class Solution {
    public int solution(int price) {
        int answer = price;
        
        if(price >= 100_000){
            answer = (int)((double)price * 0.95);
            if(price >= 300_000){
                answer = (int)((double)price * 0.90);
            }
            if(price >= 500_000){
                answer = (int)((double)price * 0.80);
            }
        }
        
        return answer;
    }
}