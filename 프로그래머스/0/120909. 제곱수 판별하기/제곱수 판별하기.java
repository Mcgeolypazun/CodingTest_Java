class Solution {
    public int solution(int n) {
        int answer = 2;
        double two = (int)Math.sqrt(n);
        double one = Math.sqrt(n);
        if(one == two){
            answer = 1;
        }
        
        return answer;
    }
}