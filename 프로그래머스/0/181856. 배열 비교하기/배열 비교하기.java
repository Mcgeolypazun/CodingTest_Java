import java.util.stream.*;
import java.util.*;
class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        if(arr1.length > arr2.length){
            return 1;
        }
        else if(arr1.length < arr2.length){
            return -1;
        }
        else{
            int a = Arrays.stream(arr1).reduce(0,(acc,i) -> acc + i);
            int b = Arrays.stream(arr2).reduce(0,(acc,i) -> acc + i);
            if(a > b){
                return 1;
            }
            else if(a < b){
                return -1;
            }
        }
        
        return answer;
    }
}