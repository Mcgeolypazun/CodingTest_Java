class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        StringBuilder str = new StringBuilder();
        for(int i=0;i<myString.length();i++){
            char c = myString.charAt(i);
            if(c == 'A'){
                str.append("B");
            }else{
                str.append("A");
            }
        }
        if(str.toString().contains(pat)){
            answer = 1;
        }
        
        return answer;
    }
}