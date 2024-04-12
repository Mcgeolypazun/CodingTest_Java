import java.util.*;
class Solution {
    public String solution(String[] arr) {
        String answer = Arrays.stream(arr).reduce("",(a,b)->a+b);
        return answer;
    }
}