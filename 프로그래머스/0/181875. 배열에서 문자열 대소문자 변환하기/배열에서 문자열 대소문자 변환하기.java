class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        boolean flag = true;
        int idx = 0;
        
        for(String s : strArr){
            if(flag){
                answer[idx++] = s.toLowerCase();
                flag = false;
            }else{
                answer[idx++] = s.toUpperCase();
                flag = true;
            }
        }
        
        return answer;
    }
}