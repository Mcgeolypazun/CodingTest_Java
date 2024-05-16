import java.util.*;
class Solution {
    public int solution(int[] num_list) {
        int answer = Arrays.stream(num_list).map(i->zeroCount(i)).sum();
        return answer;
    }
    
    int zeroCount(int a){
        int count = 0;
        while(true){
            if(a % 2 == 0){
                a /= 2;
            }
            else{
                a = (a-1)/2;
            }
            if(a == 0){
                break;
            }
            count++;
        }
        return count;
    }
}