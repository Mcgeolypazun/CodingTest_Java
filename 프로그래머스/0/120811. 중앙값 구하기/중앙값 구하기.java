import java.util.*;
class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int answer = array[(int)Math.ceil((double)array.length/2)-1];
        return answer;
    }
}