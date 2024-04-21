class Solution {
    int algorithm(int a,int b){
        String aFirst = String.valueOf(a) + String.valueOf(b);
        String bFirst = String.valueOf(b) + String.valueOf(a);
        int aInt = Integer.parseInt(aFirst);
        int bInt = Integer.parseInt(bFirst);
        
        return aInt >= bInt ? aInt : bInt;
    }
    
    public int solution(int a, int b) {
        int answer = 0;
        
        answer = algorithm(a,b);
        
        return answer;
    }
}