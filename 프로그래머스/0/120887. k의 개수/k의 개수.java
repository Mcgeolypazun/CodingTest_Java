class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int n=i;n<=j;n++){
            String s = String.valueOf(n);
            
            for(int m=0;m<s.length();m++){
                if(s.charAt(m) == String.valueOf(k).charAt(0)){
                    answer++;
                }
            }
            
        }
        
        return answer;
    }
}