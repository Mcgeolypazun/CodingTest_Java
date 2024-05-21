import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] answer;
        List<String> list = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        for(int i=0;i<myString.length();i++){
            char c = myString.charAt(i);
            if(c == 'x' && str.length() != 0){
                list.add(str.toString());
                str.setLength(0);
                continue;
            }
            else if(c != 'x'){
                str.append(c);
            }
            if(i == myString.length()-1 && c != 'x'){
                list.add(str.toString());
                str.setLength(0);
            }
        }

        answer = new String[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);

        return answer;
    }
}