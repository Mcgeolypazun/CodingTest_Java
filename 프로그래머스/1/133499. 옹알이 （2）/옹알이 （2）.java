class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(String baby : babbling){
            String str = baby.replaceAll("aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma)","*");
            String str2 = str.replaceAll("[a-z]","-");
            if(!str2.contains("-") && str2.contains("*")) answer++;
        }
        
        return answer;
    }
}