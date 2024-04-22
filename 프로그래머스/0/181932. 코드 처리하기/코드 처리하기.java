
class Solution {
    public String solution(String code) {
        StringBuilder st = new StringBuilder();
        int mode = 0;
        
        for(int i=0;i<code.length();i++){
            char curChar = code.charAt(i);
            if(curChar == '1'){
                mode = mode == 1 ? 0 : 1;
                continue;
            }
            
            if(i % 2 == mode){
                st.append(curChar+"");
            }
        }
        return st.length() == 0 ? "EMPTY" : st.toString();
        
    }
}