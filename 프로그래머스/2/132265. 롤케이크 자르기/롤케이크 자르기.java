import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for(int i=topping.length-1;i>=0;i--){
            if(!map.containsKey(topping[i])){
                map.put(topping[i],i);
            }
        }
        int big = 0;
        int small = map.size();

        for(int i=0;i<topping.length;i++){
            if(!set.contains(topping[i])){
                big++;
                set.add(topping[i]);
            }
            if(map.get(topping[i]) == i){
                small--;
            }
            if(small == big){
                answer++;
            }
        }

        return answer;
    }
}