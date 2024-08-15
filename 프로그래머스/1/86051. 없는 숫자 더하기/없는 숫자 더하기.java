import java.util.*;
class Solution {
     public int solution(int[] numbers) {
        int answer = -1;
        int sum = 1+2+3+4+5+6+7+8+9;

        answer = Arrays.stream(numbers).reduce(0,(acc, num) -> acc + num);

        answer = sum - answer;

        return answer;
    }
}