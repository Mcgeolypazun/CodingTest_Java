import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        int len = phone_book.length;
        StringBuilder s = new StringBuilder();
        HashMap<String,Boolean> map = new HashMap<>();
        Arrays.sort(phone_book);
        
        for(int i=0;i<len;i++){
            for(int j=0;j<phone_book[i].length();j++){
                s.append(phone_book[i].charAt(j));
                if(map.containsKey(s.toString())){
                    answer = false;
                    return answer;
                }
            }
            s.setLength(0);
            map.put(phone_book[i],false);
        }        
        
        return answer;
    }
}