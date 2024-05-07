import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        map.put(a,map.getOrDefault(a,0)+1);
        map.put(b,map.getOrDefault(b,0)+1);
        map.put(c,map.getOrDefault(c,0)+1);
        map.put(d,map.getOrDefault(d,0)+1);
        
        int min = Integer.MAX_VALUE;
        for(int key : map.keySet()){
            if(map.size() == 1){
                answer = 1111 * key;
            }
            else if(map.size() == 4){
                if(key < min){
                    min = key;
                }
                answer = min;
            }
            else if(map.size() == 2){
                if(map.get(key) == 2){
                    list.add(key);
                    if(list.size() == 2)
                    {
                        answer = (list.get(0)+list.get(1)) * Math.abs(list.get(0)-list.get(1));
                    } 
                }
                else{
                    list.add(key);
                    if(list.size() == 2){
                        if(map.get(list.get(0)) > map.get(list.get(1))){
                            answer = (int)Math.pow((10 * list.get(0))+list.get(1),2);
                        }
                        else{
                            answer = (int)Math.pow((10 * list.get(1))+list.get(0),2);
                        }
                    } 
                }
            }
            else if(map.size() == 3){
                if(map.get(key) != 2){
                    list.add(key);
                }
                if(list.size() == 2){
                    answer = list.get(0) * list.get(1);
                }
            }
            
        }
        
        
        return answer;
    }
}