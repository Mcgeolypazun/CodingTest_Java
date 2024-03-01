import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1];
        IntStream stream = Arrays.stream(numbers);
        answer = stream.skip(num1)
                         .limit(num2 - num1 + 1)
                         .toArray();
        
        return answer;
    }
}