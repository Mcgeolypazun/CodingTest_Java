class Solution {
    public String solution(int age) {
        StringBuilder answer = new StringBuilder();
        
        while(age > 0){
            int a = age % 10;
            
            answer.insert(0,String.valueOf((char)('a' + a)));
            
            age /= 10;
            
        }
        
        return answer.toString();
    }
}