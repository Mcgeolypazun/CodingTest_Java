class Solution {
    public String solution(String new_id) {
        String answer = new_id.toLowerCase();
        answer = answer.replaceAll("[^a-z0-9-_.]","");
        answer = answer.replaceAll("[.]+",".");
        StringBuilder str = new StringBuilder(answer);
       
        if(str.charAt(0) == '.') str.deleteCharAt(0);
        if(str.length() > 0 && str.charAt(str.length()-1) == '.') str.deleteCharAt(str.length()-1);
        
        if(str.length() == 0) str.append("a");
        
        if(str.length() >= 16){
            str.delete(15,str.length());
            if(str.charAt(str.length()-1) == '.') str.deleteCharAt(str.length()-1);
        }
        
        if(str.length() < 3){
            for(int i=str.length();i<3;i++)
            str.append(str.charAt(str.length()-1));
        }
        
        
        
        return str.toString();
    }
}