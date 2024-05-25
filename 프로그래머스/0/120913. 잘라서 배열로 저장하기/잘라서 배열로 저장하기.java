class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[my_str.length() % n == 0 ? my_str.length()/n : my_str.length()/n+1];
        int idx = 0;
        while(idx != answer.length-1){
            answer[idx] = my_str.substring(idx*n,idx*n+n);
            idx++;
        }
        
        answer[idx] = my_str.substring(idx*n, my_str.length());
        
        return answer;
    }
}