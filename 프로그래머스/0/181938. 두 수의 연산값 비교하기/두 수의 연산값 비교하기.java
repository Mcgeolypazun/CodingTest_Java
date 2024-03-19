class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String c = String.valueOf(a)+String.valueOf(b);
        int cc = Integer.parseInt(c);
        
        int d = 2 * a * b;
        
        if(cc > d){
            answer = cc;
        }
        else{
            answer = d;
        }
        
        
        return answer;
    }
}