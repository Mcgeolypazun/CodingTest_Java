import java.util.*;
class Solution {
    public String solution(String myString, String pat) {
        StringBuilder answer = new StringBuilder(myString);
        int start = myString.lastIndexOf(pat)+pat.length();
        int end = myString.length();
        answer.delete(start,end);
        
        return answer.toString();

    }
}