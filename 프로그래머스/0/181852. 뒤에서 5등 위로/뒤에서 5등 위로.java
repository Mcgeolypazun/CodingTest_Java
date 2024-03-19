import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length-5];
        
        answer =  IntStream.of(num_list).sorted().skip(5).toArray();
        
        return answer;
    }
}