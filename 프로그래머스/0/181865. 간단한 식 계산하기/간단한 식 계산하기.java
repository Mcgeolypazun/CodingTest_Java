import java.util.*;
class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] str = Arrays.stream(binomial.split(" ")).toArray(String[]::new);
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[2]);
        switch(str[1]){
            case "+":
                answer = a+b;
                break;
            case "-":
                answer = a-b;
                break;
            case "*":
                answer = a*b;
        }
        
        return answer;
    }
}